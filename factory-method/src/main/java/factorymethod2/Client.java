package factorymethod2;

import factorymethod2.factory.Dialog;
import factorymethod2.factory.HtmlDialog;
import factorymethod2.factory.WindowsDialog;

public class Client {

	private static Dialog dialog;

	public static void main(String[] args) {
		configure();
		runBusinessLogic();
	}

	/**
	 * The concrete factory is usually chosen depending on configuration or
	 * environment options.
	 */
	static void configure() {
		if (System.getProperty("os.name").equals("Windows 10")) {
			dialog = new WindowsDialog();
		} else {
			dialog = new HtmlDialog();
		}
	}

	static void runBusinessLogic() {
		dialog.renderWindow();
	}

}