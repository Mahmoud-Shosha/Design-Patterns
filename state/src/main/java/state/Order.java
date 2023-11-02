package state;

// It represents the Context class
public class Order {

	private OrderState currentState;

	public Order() {
		currentState = new New();
	}

	public double cancel() {
		double fees = currentState.handleCancellation();
		currentState = new Cancelled();
		return fees;
	}

	public void paymentSuccessful() {
		currentState = new Paid();
	}

	public void dispatched() {
		currentState = new InTransit();
	}

	public void delivered() {
		currentState = new InTransit();
	}

}
