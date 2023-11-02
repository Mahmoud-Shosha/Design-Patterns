package mediator;

// It represents the abstract colleague
public interface UIControl {

	void controlChanged(UIControl Control);

	String getControlValue();

	String getControlName();

}
