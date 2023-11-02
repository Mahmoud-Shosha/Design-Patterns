package state;

public class Paid implements OrderState {

	@Override
	public double handleCancellation() {
		// Logic needed to handle paid order cancellation
		// Like roll back payment from payment gateway
		System.out.println("Cancel Paid Order");
		return 10;
	}

}
