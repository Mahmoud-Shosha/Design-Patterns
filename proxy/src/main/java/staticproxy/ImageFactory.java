package staticproxy;

// Factory class to get Image objects
public class ImageFactory {

	public static Image getImage(String name) {
		return new ImageProxy(name);
	}

}
