package observer;

import java.util.ArrayList;
import java.util.List;

// It represents a Publisher class
public class Order {

	private String id;
	private double itemsCost;
	private int itemsCount;
	private double shippingCost;
	private double discount;
	private List<OrderObserver> observers = new ArrayList<>();

	public Order(String id) {
		this.id = id;
	}

	public double getTotal() {
		return itemsCost + shippingCost - discount;
	}

	public void addItem(double price) {
		itemsCost += price;
		itemsCount++;
		notifyObservers();
	}

	public int getItemsCount() {
		return itemsCount;
	}

	public double getItemsCost() {
		return itemsCost;
	}

	public double getDiscount() {
		return discount;
	}

	public double getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public void attach(OrderObserver observer) {
		observers.add(observer);
	}

	public void detach(OrderObserver observer) {
		observers.remove(observer);
	}

	private void notifyObservers() {
		observers.forEach(o -> o.updated(this));
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", itemsCount=" + itemsCount + ", itemsCost=" + itemsCost + ", shippingCost="
				+ shippingCost + ", discount=" + discount + "]";
	}

}
