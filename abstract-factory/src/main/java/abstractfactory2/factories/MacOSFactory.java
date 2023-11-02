package abstractfactory2.factories;

import abstractfactory2.buttons.Button;
import abstractfactory2.buttons.MacOSButton;
import abstractfactory2.checkboxes.Checkbox;
import abstractfactory2.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}

}
