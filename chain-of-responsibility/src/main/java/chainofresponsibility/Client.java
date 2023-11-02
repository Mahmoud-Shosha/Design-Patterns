package chainofresponsibility;

import java.time.LocalDate;

import chainofresponsibility.LeaveApplication.Type;

public class Client {

	public static void main(String[] args) {
		LeaveApplication leaveApplication = LeaveApplication.getBuilder().withType(Type.SICK)
				.from(LocalDate.of(2018, 2, 2)).to(LocalDate.of(2018, 2, 20)).build();

		System.out.println(leaveApplication);
		LeaveApprover leaveApprover = createApproversChain();
		leaveApprover.processLeaveApplication(leaveApplication);
		System.out.println(leaveApplication);

	}

	private static LeaveApprover createApproversChain() {
		Director director = new Director(null);
		Manager mangaer = new Manager(director);
		ProjectLead projectLead = new ProjectLead(mangaer);
		return projectLead;
	}

}
