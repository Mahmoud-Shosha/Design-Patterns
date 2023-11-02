package interpreter;

import java.util.Stack;
import java.util.StringTokenizer;

// It parses and builds the abstract syntax tree
public class ExpressionBuilder {

	private Stack<PermissionExpression> permissions = new Stack<>();
	private Stack<String> operators = new Stack<>();

	public PermissionExpression build(Report report) {
		parse(report.getPermission());
		buildExpressions();
		if (permissions.size() > 1 || !operators.isEmpty()) {
			System.out.println("Error");
		}
		return permissions.pop();
	}

	private void parse(String permission) {
		// The tokenizer uses the default delimiter set, which is " \t\n\r\f":
		// the space character, the tab character, the newline character,
		// the carriage-return character, and the form-feed character
		// Delimiter characters themselves will not be treated as tokens
		StringTokenizer tokenizer = new StringTokenizer(permission);
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			switch (token) {
			case "AND":
				operators.push("AND");
				break;
			case "OR":
				operators.push("OR");
				break;
			case "NOT":
				operators.push("NOT");
				break;
			default:
				permissions.push(new Permission(token));
			}
		}
	}

	private void buildExpressions() {
		while (!operators.isEmpty()) {
			String operator = operators.pop();
			PermissionExpression perm1;
			PermissionExpression perm2;
			PermissionExpression exp;
			switch (operator) {
			case "NOT":
				perm1 = permissions.pop();
				exp = new NotExpression(perm1);
				break;
			case "AND":
				perm1 = permissions.pop();
				perm2 = permissions.pop();
				exp = new AndExpression(perm1, perm2);
				break;
			case "OR":
				perm1 = permissions.pop();
				perm2 = permissions.pop();
				exp = new OrExpression(perm1, perm2);
				break;
			default:
				throw new IllegalArgumentException("Unknown operator:" + operator);
			}
			permissions.push(exp);
		}
	}

}
