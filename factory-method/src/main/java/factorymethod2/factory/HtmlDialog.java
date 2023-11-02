package factorymethod2.factory;

import factorymethod2.buttons.Button;
import factorymethod2.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

	@Override
	public Button createButton() {
		return new HtmlButton();

	}
}