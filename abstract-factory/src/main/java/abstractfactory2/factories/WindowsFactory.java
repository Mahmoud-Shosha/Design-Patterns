package abstractfactory2.factories;

import abstractfactory2.buttons.Button;
import abstractfactory2.buttons.WindowsButton;
import abstractfactory2.checkboxes.Checkbox;
import abstractfactory2.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}

}
