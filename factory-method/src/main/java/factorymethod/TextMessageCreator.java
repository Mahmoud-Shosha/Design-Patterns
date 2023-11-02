package factorymethod;

//It provides implementation for creating text messages
public class TextMessageCreator extends MessageCreator {

	@Override
	protected Message createMessage() {
		return new TextMessage();
	}

}
