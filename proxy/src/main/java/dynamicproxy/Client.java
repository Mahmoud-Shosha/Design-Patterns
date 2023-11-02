package dynamicproxy;

import javafx.geometry.Point2D;
import staticproxy.Image;
import staticproxy.ImageFactory;

public class Client {

	public static void main(String[] args) {
		Image image = ImageFactory.getImage("icon.png");
		image.setLocation(new Point2D(50, 50));
		System.out.println(image.getLocation());
		System.out.println("Rendring image ...");
		image.render();
	}

}
