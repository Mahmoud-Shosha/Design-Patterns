package interpreter;

public class Client {

	public static void main(String[] args) {
		Report report1 = new Report("Cashflow report", "NOT ADMIN");
		Report report2 = new Report("Cashflow report", "FINANCE_ADMIN OR ADMIN");
		User user = new User("Mahmoud Shousha", "USER", "ADMIN");

		ExpressionBuilder builder = new ExpressionBuilder();

		PermissionExpression expression = builder.build(report1); // The root of the syntax tree
		System.out.println(expression);
		System.out.println("User Accesss Report: " + expression.interpret(user));

		expression = builder.build(report2); // The root of the syntax tree
		System.out.println(expression);
		System.out.println("User Accesss Report: " + expression.interpret(user));
	}

}
