package chainofresponsibility;

//It represents a concrete handler
public class Director extends Employee {

	public Director(LeaveApprover successor) {
		super("Director", successor);
	}

	@Override
	protected boolean processRequest(LeaveApplication application) {
		if (application.getType().equals(LeaveApplication.Type.PTO)) {
			application.approve(getApproverRole());
			return true;
		}
		return false;
	}

}
