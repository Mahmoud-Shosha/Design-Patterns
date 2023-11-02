package staticproxy;

import javafx.geometry.Point2D;

// The proxy class
public class ImageProxy implements Image {

	private BitmapImage image;
	private Point2D location;
	private String name;

	// We need to hold object creation until we absolutely need it
	public ImageProxy(String name) {
		this.name = name;
	}

	@Override
	public void setLocation(Point2D location) {
		if (image != null) {
			image.setLocation(location);
		} else {
			this.location = location;
		}
	}

	@Override
	public Point2D getLocation() {
		if (image != null) {
			return image.getLocation();
		} else {
			return location;
		}
	}

	@Override
	public void render() {
		if (image == null) {
			image = new BitmapImage(name);
			if (location != null) {
				image.setLocation(location);
			}
		}
		image.render();
	}

}
