package staticproxy;

import javafx.geometry.Point2D;

public class Client {

	public static void main(String[] args) {
		Image image = ImageFactory.getImage("icon.png");
		image.setLocation(new Point2D(10, 10));
		System.out.println(image.getLocation());
		System.out.println("Rendring image ...");
		image.render();
	}

}
