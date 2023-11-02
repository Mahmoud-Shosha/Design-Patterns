package templatemethod;

// It represents the abstract base class of the template method
public abstract class OrderPrinter {

	// It represents the template method
	public final void printOrder(Order order) {
		System.out.println(header());
		System.out.println(formatOrderNumber(order));
		System.out.println(formatOrderItems(order));
		System.out.println(formatOrderTotal(order));
		System.out.println(footer());
	}

	protected abstract String header();

	protected abstract String formatOrderNumber(Order order);

	protected abstract String formatOrderItems(Order order);

	protected abstract String formatOrderTotal(Order order);

	protected abstract String footer();

}
