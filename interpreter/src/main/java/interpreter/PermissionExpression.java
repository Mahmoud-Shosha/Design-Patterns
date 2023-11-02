package interpreter;

// It represents the AbstractExpression
public interface PermissionExpression {

	boolean interpret(User user);

}
