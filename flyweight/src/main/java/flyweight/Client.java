package flyweight;

import flyweight.ErrorMessageFactory.ErrorType;

public class Client {

	public static void main(String[] args) {
		SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getSystemErrorMessage(ErrorType.GenericSystemError);
		System.out.println(msg1.getText("66609"));
		System.out.println("=====================");
		UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance().getUserBannedErrorMessage("99980");
		System.out.println(msg2.getText(null));
		System.out.println("=====================");
	}

}
