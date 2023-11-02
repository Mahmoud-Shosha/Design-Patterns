package flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight objects factory
public class ErrorMessageFactory {

	public enum ErrorType {
		GenericSystemError, PageNotFoundError, ServerError
	}

	// Eager singleton class
	private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

	private Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();

	private ErrorMessageFactory() {
		errorMessages.put(ErrorType.GenericSystemError,
				new SystemErrorMessage("A generic error of type $errorCode occurred", "https://company.com/errors/"));
		errorMessages.put(ErrorType.PageNotFoundError,
				new SystemErrorMessage("Page not found error occurred", "https://company.com/errors/"));
	}

	public static ErrorMessageFactory getInstance() {
		return FACTORY;
	}

	public SystemErrorMessage getSystemErrorMessage(ErrorType errorType) {
		return errorMessages.get(errorType);
	}

	public UserBannedErrorMessage getUserBannedErrorMessage(String caseId) {
		return new UserBannedErrorMessage(caseId);
	}

}
