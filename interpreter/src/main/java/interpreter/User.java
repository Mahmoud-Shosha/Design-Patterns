package interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// It is used as the context class
public class User {

	private String username;
	private List<String> permissions; // usually stored in DB

	public User(String username, String... permissions) {
		this.username = username;
		this.permissions = new ArrayList<>();
		Stream.of(permissions).forEach(e -> this.permissions.add(e.toLowerCase()));
	}

	public String getUsername() {
		return username;
	}

	public List<String> getPermissions() {
		return permissions;
	}

}
