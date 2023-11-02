package objectpool;

import javafx.geometry.Point2D;

// It represents a concrete reusable
// It represents a bitmap file stored in desk
public class BitMap implements Image {

	private Point2D location;
	private String name;

	public BitMap(String name) {
		this.name = name;
		// Read the file with this name from the desk
		// Store the file content in a byte array
	}

	@Override
	public void draw() {
		System.out.println("Drawing " + name + " @ " + location);
	}

	@Override
	public Point2D getLocation() {
		return location;
	}

	@Override
	public void setLocation(Point2D location) {
		this.location = location;
	}

	@Override
	public void reset() {
		this.location = null;
		System.out.println("Bitmap object is reset");
	}

}
