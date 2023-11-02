package factorymethod;

// This is the abstract Creator
public abstract class MessageCreator {

	// This method is not mandatory
	// But commonly we need to perform some logic
	// in the message before return it to the client
	public Message getMessage() {
		Message msg = createMessage();
		msg.addDefaultHeaders();
		msg.encrypt();
		return msg;
	}

	// The factory method
	protected abstract Message createMessage();

}
