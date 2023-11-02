package decorator;

public class Client {

	public static void main(String[] args) {
		Message msg = new TextMessage("The <FORCE> is strong with this one !");
		System.out.println(msg.getContent());

		Message htmlEncodedMessage = new HTMLEncodedMessage(msg);
		System.out.println(htmlEncodedMessage.getContent());

		Message base64EncodedMessage = new Base64EncodedMessage(msg);
		System.out.println(base64EncodedMessage.getContent());

	}

}
