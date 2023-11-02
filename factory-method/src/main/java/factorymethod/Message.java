package factorymethod;

// This is the Product abstract class	
public abstract class Message {

	public abstract String getContent();

	public void addDefaultHeaders() {
		// Add some default headers
	}

	public void encrypt() {
		// Encrypt the content
	}

}
