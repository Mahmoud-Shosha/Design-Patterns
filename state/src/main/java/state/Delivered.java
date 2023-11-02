package state;

public class Delivered implements OrderState {

	@Override
	public double handleCancellation() {
		// Logic needed to handle new order cancellation
		// Like contacting courier service for item pickup
		// and roll back payment from payment gateway
		System.out.println("Cancel Delivered Order");
		return 20;
	}

}
