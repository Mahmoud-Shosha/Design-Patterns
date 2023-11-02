package chainofresponsibility;

// It represents the handler interface
public interface LeaveApprover {

	void processLeaveApplication(LeaveApplication application);

	String getApproverRole();

}
