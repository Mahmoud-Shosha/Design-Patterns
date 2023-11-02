package chainofresponsibility2.middleware;

public class ThrottlingMiddleware extends Middleware {

	private int requestPerMinute;
	private int request;
	private long currentTime;

	public ThrottlingMiddleware(int requestPerMinute) {
		this.requestPerMinute = requestPerMinute;
		this.currentTime = System.currentTimeMillis();
	}

	// checkNext() call can be in the beginning of this method or in the end
	// For instance, an element of a chain can change the order of checks by running
	// its check after all other checks
	public boolean check(String email, String password) {
		if (System.currentTimeMillis() > currentTime + 60_000) {
			request = 0;
			currentTime = System.currentTimeMillis();
		}
		request++;

		if (request > requestPerMinute) {
			System.out.println("Request limit exceeded!");
			return false;
		}
		return checkNext(email, password);
	}

}
