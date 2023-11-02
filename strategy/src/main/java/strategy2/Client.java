package strategy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import strategy2.order.Order;
import strategy2.strategies.PayByCreditCard;
import strategy2.strategies.PayByPayPal;
import strategy2.strategies.PayStrategy;

public class Client {

	private static Map<Integer, Integer> productsPrice = new HashMap<>();
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	private static PayStrategy strategy;

	static {
		productsPrice.put(1, 2200);
		productsPrice.put(2, 1850);
		productsPrice.put(3, 1100);
		productsPrice.put(4, 890);
	}

	public static void main(String[] args) throws IOException {
		System.out.print("Please, select a product:" + "\n" + "1 - Mother board" + "\n" + "2 - CPU" + "\n" + "3 - HDD"
				+ "\n" + "4 - Memory" + "\n");
		int choice = Integer.parseInt(reader.readLine());
		int cost = productsPrice.get(choice);
		System.out.print("Count: ");
		int count = Integer.parseInt(reader.readLine());
		Order order = new Order();
		order.setTotalCost(cost * count);

		// Client creates different strategies based on input from user, application
		// configuration, etc.
		System.out.println("Please, select a payment method:" + "\n" + "1 - PalPay" + "\n" + "2 - Credit Card");
		String paymentMethod = reader.readLine();
		if (paymentMethod.equals("1")) {
			strategy = new PayByPayPal();
		} else {
			strategy = new PayByCreditCard();
		}

		// Order object delegates gathering payment data to strategy object, since only
		// strategies know what data they need to process a payment
		order.processOrder(strategy);
		strategy.pay(order.getTotalCost());
		System.out.println("Payment has been successful.");

	}

}
