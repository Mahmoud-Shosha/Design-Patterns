package command;

// It represents the receiver class
public class EWSService {

	// Add a member to the mailing list
	public void addMember(String contact, String contactGroup) {
		// Contact email web exchange service ...
		System.out.println("ADDED: " + contact + " TO " + contactGroup);
	}

	// Remove a member from the mailing list
	public void removeMember(String contact, String contactGroup) {
		// Contact email web exchange service ...
		System.out.println("REMOVED: " + contact + " FROM " + contactGroup);
	}

}
