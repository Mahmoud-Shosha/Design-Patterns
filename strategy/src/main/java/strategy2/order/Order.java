package strategy2.order;

import strategy2.strategies.PayStrategy;

public class Order {

	private int totalCost = 0;

	public void processOrder(PayStrategy strategy) {
		strategy.collectPaymentDetails();
		// Here we could collect and store payment data from the strategy.
	}

	public void setTotalCost(int cost) {
		this.totalCost += cost;
	}

	public int getTotalCost() {
		return totalCost;
	}

}
