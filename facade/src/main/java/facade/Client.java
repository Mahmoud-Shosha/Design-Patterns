package facade;

import facade.email.Email;
import facade.email.EmailFacade;
import facade.email.Mailer;
import facade.email.Stationary;
import facade.email.StationaryFactory;
import facade.email.Template;
import facade.email.Template.TemplateType;
import facade.email.TemplateFactory;

public class Client {

	public static void main(String[] args) {
		Order order = new Order("101", 99.99);

		// Without Facade
		boolean result = sendOrderEmailWithoutFacade(order);
		System.out.println("Order Email " + (result ? "sent!" : "NOT sent..."));

		// With Facade
		EmailFacade facade = new EmailFacade();
		result = facade.sendOrderEmail(order);
		System.out.println("Order Email " + (result ? "sent!" : "NOT sent..."));
	}

	// If we use the email subsystem directly, client will be tightly coupled with it
	// So client will be tightly coupled with Template, TemplateFactory, Email,
	// EmailBuilder, Stationary, StationaryFactory and Mailer classes
	private static boolean sendOrderEmailWithoutFacade(Order order) {
		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
		Stationary stationary = StationaryFactory.createStationary();
		Email email = Email.getBuilder().withTemplate(template).withStationary(stationary).forObject(order).build();
		Mailer mailer = Mailer.getMailer();
		return mailer.send(email);
	}

}
