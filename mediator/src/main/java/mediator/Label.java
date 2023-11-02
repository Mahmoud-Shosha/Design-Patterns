package mediator;

public class Label extends javafx.scene.control.Label implements UIControl {

	public Label(UIMediator mediator) {
		mediator.register(this);
		this.setMinWidth(100);
		this.setText("Label");
	}

	@Override
	public void controlChanged(UIControl control) {
		this.setText(control.getControlValue());
	}

	@Override
	public String getControlValue() {
		return this.getText();
	}

	@Override
	public String getControlName() {
		return "Label";
	}

}
