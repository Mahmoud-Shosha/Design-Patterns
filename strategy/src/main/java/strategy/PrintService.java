package strategy;

import java.util.LinkedList;

// It represents the Context class
public class PrintService {

	private OrderPrinter printer;

	public PrintService(OrderPrinter printer) {
		this.printer = printer;
	}

	public void printOrders(LinkedList<Order> orders) {
		printer.print(orders);
	}

}
