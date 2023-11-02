package templatemethod;

public class Client {

	public static void main(String[] args) {
		Order order = new Order("1001");
		order.addItem("Soda", 2.5);
		order.addItem("Chips", 10);
		order.addItem("Cake", 20);
		order.addItem("Cookies", 5);

		OrderPrinter printer = new TextPrinter();
		printer.printOrder(order);

		printer = new HtmlPrinter();
		printer.printOrder(order);
	}

}
