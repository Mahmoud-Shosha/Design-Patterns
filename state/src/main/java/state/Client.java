package state;

public class Client {

	public static void main(String[] args) {
		Order order = new Order();
		System.out.println("Fees: " + order.cancel());

		order = new Order();
		order.paymentSuccessful();
		System.out.println("Fees: " + order.cancel());

		order = new Order();
		order.paymentSuccessful();
		order.dispatched();
		System.out.println("Fees: " + order.cancel());
		System.out.println("Fees: " + order.cancel());
	}

}
