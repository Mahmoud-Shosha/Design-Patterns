package observer;

//It represents a Subscriber class
public class QuantityObserver implements OrderObserver {

	@Override
	public void updated(Order order) {
		int count = order.getItemsCount();
		if (count <= 5) {
			order.setShippingCost(10);
		} else {
			order.setShippingCost(10 + (count - 5) * 1.5);
		}
	}

}
