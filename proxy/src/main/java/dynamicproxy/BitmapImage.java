package dynamicproxy;

import javafx.geometry.Point2D;

// The real class
public class BitmapImage implements Image {

	private Point2D location;
	private String name;

	public BitmapImage(String name) {
		this.name = name;
		System.out.println("Loaded from disk: " + name);
	}

	@Override
	public void setLocation(Point2D location) {
		this.location = location;
	}

	@Override
	public Point2D getLocation() {
		return location;
	}

	@Override
	public void render() {
		System.out.println("Rendered: " + name);

	}

}
