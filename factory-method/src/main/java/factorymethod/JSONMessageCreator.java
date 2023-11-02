package factorymethod;

// It provides implementation for creating JSON messages
public class JSONMessageCreator extends MessageCreator {

	@Override
	protected Message createMessage() {
		return new JSONMessage();
	}

}
