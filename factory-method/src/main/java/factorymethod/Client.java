package factorymethod;

public class Client {

	public static void main(String[] args) {
		printMessage(new TextMessageCreator());
		printMessage(new JSONMessageCreator());
	}

	public static void printMessage(MessageCreator messageCreator) {
		Message msg = messageCreator.createMessage();
		System.out.println(msg.getContent());
	}

}
