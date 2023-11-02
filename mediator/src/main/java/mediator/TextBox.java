package mediator;

import javafx.scene.control.TextField;

public class TextBox extends TextField implements UIControl {

	private boolean mediatedUpdate;

	public TextBox(UIMediator mediator) {
		mediator.register(this);
		this.textProperty().addListener((property, oldValue, newValue) -> {
			if (!mediatedUpdate)
				mediator.valueChanged(this);
		});
		this.setText("TextBox");
	}

	@Override
	public void controlChanged(UIControl control) {
		this.mediatedUpdate = true;
		this.setText(control.getControlValue());
		this.mediatedUpdate = false;
	}

	@Override
	public String getControlValue() {
		return this.getText();
	}

	@Override
	public String getControlName() {
		return "TextBox";
	}

}
