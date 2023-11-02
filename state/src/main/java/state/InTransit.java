package state;

public class InTransit implements OrderState {

	@Override
	public double handleCancellation() {
		// Logic needed to handle new order cancellation
		// Like contacting courier service for cancellation
		// and roll back payment from payment gateway
		System.out.println("Cancel InTransit Order");
		return 20;
	}

}
