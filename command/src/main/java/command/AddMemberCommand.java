package command;

// It represents a ConcreteCommand class
public class AddMemberCommand implements Command {

	private EWSService ewsService;
	private String emailAddress;
	private String listName;

	// We can get the receiver instance from the container like Spring IOC container
	public AddMemberCommand(String emailAddress, String listName, EWSService ewsService) {
		this.emailAddress = emailAddress;
		this.listName = listName;
		this.ewsService = ewsService;
	}

	@Override
	public void execute() {
		ewsService.addMember(emailAddress, listName);
	}

}
