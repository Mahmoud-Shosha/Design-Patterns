package observer;

public class Client {

	public static void main(String[] args) {
		Order order = new Order("100");

		PriceObserver priceObserver = new PriceObserver();
		order.attach(priceObserver);
		QuantityObserver quantityObserver = new QuantityObserver();
		order.attach(quantityObserver);

		order.addItem(50);
		System.out.println(order);
		order.addItem(200);
		System.out.println(order);
		order.addItem(100);
		order.addItem(100);
		order.addItem(100);
		order.addItem(100);
		System.out.println(order);
	}

}
