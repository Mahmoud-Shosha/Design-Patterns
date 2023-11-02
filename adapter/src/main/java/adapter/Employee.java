package adapter;

// Adaptee
// An existing class used in our system
public class Employee {

	private String fullName;
	private String jobTitle;
	private String OfficeLocation;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getOfficeLocation() {
		return OfficeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		OfficeLocation = officeLocation;
	}

}
