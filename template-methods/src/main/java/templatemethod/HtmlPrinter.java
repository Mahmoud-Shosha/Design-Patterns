package templatemethod;

public class HtmlPrinter extends OrderPrinter {

	@Override
	protected String header() {
		return "<html><head><title>Order Details</title></head><body>";
	}

	@Override
	protected String formatOrderNumber(Order order) {
		return "<h1>Order #" + order.getId() + "</h1>";
	}

	@Override
	protected String formatOrderItems(Order order) {
		StringBuilder sb = new StringBuilder("<p><ul>");
		order.getItems().entrySet().stream()
				.forEach(entry -> sb.append("<li>" + entry.getKey() + " -> $" + entry.getValue() + "</li>"));
		sb.append("</ul></p>");
		return sb.toString();
	}

	@Override
	protected String formatOrderTotal(Order order) {
		return "<br/><hr/><h3>Total -> $" + order.getTotal() + "h3";
	}

	@Override
	protected String footer() {
		return "</body></html>";
	}

}
