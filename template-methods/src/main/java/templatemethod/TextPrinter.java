package templatemethod;

public class TextPrinter extends OrderPrinter {

	@Override
	protected String header() {
		return "Order Details";
	}

	@Override
	protected String formatOrderNumber(Order order) {
		return "Order #" + order.getId();
	}

	@Override
	protected String formatOrderItems(Order order) {
		StringBuilder sb = new StringBuilder("Items\n-----------------------------\n");
		order.getItems().entrySet().stream()
				.forEach(entry -> sb.append(entry.getKey() + " -> $" + entry.getValue() + "\n"));
		sb.append("-----------------------------");
		return sb.toString();
	}

	@Override
	protected String formatOrderTotal(Order order) {
		return "Total -> $" + order.getTotal();
	}

	@Override
	protected String footer() {
		return "";
	}

}
