package chainofresponsibility2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import chainofresponsibility2.middleware.Middleware;
import chainofresponsibility2.middleware.RoleCheckMiddleware;
import chainofresponsibility2.middleware.ThrottlingMiddleware;
import chainofresponsibility2.middleware.UserExistsMiddleware;
import chainofresponsibility2.server.Server;

public class Client {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static Server server;

	private static void init() {
		server = new Server();
		Middleware middleware = Middleware.link(new ThrottlingMiddleware(2), new UserExistsMiddleware(server),
				new RoleCheckMiddleware());
		server.register("admin@example.com", "admin_pass");
		server.register("user@example.com", "user_pass");
		server.setMiddleware(middleware);
	}

	public static void main(String[] args) throws IOException {
		init();
		boolean success;
		do {
			System.out.print("Enter email: ");
			String email = reader.readLine();
			System.out.print("Input password: ");
			String password = reader.readLine();
			success = server.logIn(email, password);
		} while (!success);
	}

}
