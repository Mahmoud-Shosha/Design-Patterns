package mediator;

public class Slider extends javafx.scene.control.Slider implements UIControl {

	private boolean mediatedUpdate;

	public Slider(UIMediator mediator) {
		mediator.register(this);
		this.valueProperty().addListener((property, oldValue, newValue) -> {
			if (!mediatedUpdate)
				mediator.valueChanged(this);
		});
		this.setMin(0);
		this.setMax(50);
		this.setBlockIncrement(5);
	}

	@Override
	public void controlChanged(UIControl control) {
		this.mediatedUpdate = true;
		this.setValue(Double.valueOf(control.getControlValue()));
		this.mediatedUpdate = false;
	}

	@Override
	public String getControlValue() {
		return Double.toString(this.getValue());
	}

	@Override
	public String getControlName() {
		return "Slider";
	}

}
