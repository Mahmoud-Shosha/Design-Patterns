package strategy2.strategies;

public class PayByCreditCard implements PayStrategy {

	@Override
	public void collectPaymentDetails() {
		System.out.println("Enter the card number, expiration date 'mm/yy' and the CVV code ...");
		// Validate credit card logic
	}

	@Override
	public void pay(int paymentAmount) {
		System.out.println("Paying " + paymentAmount + " using Credit Card.");

	}

}
