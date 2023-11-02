package strategy;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

// It represents a ConcreteStrategy class
public class DetailPrinter implements OrderPrinter {

	@Override
	public void print(Collection<Order> orders) {
		System.out.println("************** Detail Report **************");
		Iterator<Order> iterator = orders.iterator();
		double total = 0;
		for (int i = 1; iterator.hasNext(); i++) {
			Order order = iterator.next();
			total += order.getTotal();
			System.out.println(i + ". " + order.getId() + "\t" + order.getDate() + "\t" + order.getItems().size() + "\t"
					+ order.getTotal());
			for (Entry<String, Double> entry : order.getItems().entrySet()) {

				System.out.println("\t" + entry.getKey() + " -> " + entry.getValue());
			}
		}
		System.out.println("*******************************************");
		System.out.println("\t\tTotal: " + total);
	}

}
