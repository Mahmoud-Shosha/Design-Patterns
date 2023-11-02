package adapter;

public class Main {

	public static void main(String[] args) {
		// Using class / two-way adapter
		EmployeeClassAdapter adapter = new EmployeeClassAdapter();
		fillEmployeeData(adapter);
		BusinessCardDesigner designer = new BusinessCardDesigner();
		String card = designer.designCard(adapter);
		System.out.println(card);
		System.out.println("****************************************");
		// Using object adapter
		Employee employee = new Employee();
		fillEmployeeData(employee);
		EmployeeObjectAdapter adapter2 = new EmployeeObjectAdapter(employee);
		card = designer.designCard(adapter2);
		System.out.println(card);
	}

	private static void fillEmployeeData(Employee employee) {
		employee.setFullName("Mahmoud Shousha");
		employee.setJobTitle("Backend Engineer");
		employee.setOfficeLocation("Egypt, Cairo, 5th settlement");
	}

}
