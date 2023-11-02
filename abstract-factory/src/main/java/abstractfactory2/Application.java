package abstractfactory2;

import abstractfactory2.buttons.Button;
import abstractfactory2.checkboxes.Checkbox;
import abstractfactory2.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {

	private Button button;
	private Checkbox checkbox;

	public Application(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}

	public void paint() {
		button.paint();
		checkbox.paint();
	}
}
