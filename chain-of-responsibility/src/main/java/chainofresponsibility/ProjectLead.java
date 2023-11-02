package chainofresponsibility;

// It represents a concrete handler
public class ProjectLead extends Employee {

	public ProjectLead(LeaveApprover successor) {
		super("Project Lead", successor);
	}

	@Override
	protected boolean processRequest(LeaveApplication application) {
		// Project lead is able to process the leave application
		// only for sick leave and duration is <= 2 days
		if (application.getType().equals(LeaveApplication.Type.SICK) && application.getNoOfDays() <= 2) {
			application.approve(getApproverRole());
			return true;
		}
		return false;
	}

}
