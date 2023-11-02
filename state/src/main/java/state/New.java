package state;

public class New implements OrderState {

	@Override
	public double handleCancellation() {
		// Logic needed to handle new order cancellation
		System.out.println("Cancel New Order");
		return 0;
	}

}
