package factorymethod2.factory;

import factorymethod2.buttons.Button;
import factorymethod2.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

}