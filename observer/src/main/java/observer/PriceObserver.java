package observer;

//It represents a Subscriber class
public class PriceObserver implements OrderObserver {

	@Override
	public void updated(Order order) {
		// Check for discount
		if (order.getItemsCost() > 500) {
			order.setDiscount(20);
		} else if (order.getItemsCost() > 200) {
			order.setDiscount(10);
		}

	}

}
