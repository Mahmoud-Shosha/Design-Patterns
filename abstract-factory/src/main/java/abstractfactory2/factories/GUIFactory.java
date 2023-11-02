package abstractfactory2.factories;

import abstractfactory2.buttons.Button;
import abstractfactory2.checkboxes.Checkbox;

public interface GUIFactory {

	Button createButton();

	Checkbox createCheckbox();

}
