package strategy2.strategies;

public class PayByPayPal implements PayStrategy {

	@Override
	public void collectPaymentDetails() {
		System.out.println("Enter your username and password ...");
		// Authenticate payPal user logic
	}

	@Override
	public void pay(int paymentAmount) {
		System.out.println("Paying " + paymentAmount + " using PayPal.");
	}

}
