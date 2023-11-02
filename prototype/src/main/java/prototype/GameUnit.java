package prototype;

import javafx.geometry.Point3D;

// This is the abstract prototype class
public abstract class GameUnit implements Cloneable {

	private Point3D position;

	public GameUnit() {
		this.position = Point3D.ZERO;
	}

	public GameUnit(float x, float y, float z) {
		this.position = new Point3D(x, y, z);
	}

	public void move(Point3D direction, float distance) {
		Point3D finalMove = direction.normalize();
		finalMove = finalMove.multiply(distance);
		position = position.add(finalMove);
	}

	public Point3D getPosition() {
		return this.position;
	}

	// This method is protected in Object class, but we make it public
	// This method returns Object in the Object class, but we make it return
	// GameUnit
	// We will keep 'CloneNotSupportedException' so that subclasses that do not
	// support cloning can throw it
	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		// Doing a shallow copy, so we can use the Object.clone() method
		// We do a shallow copy as Point3D object is immutable
		GameUnit gameUnit = (GameUnit) super.clone();
		gameUnit.initialize();
		return gameUnit;
	}

	// When want to reset the object state when returning a clone
	private void initialize() {
		this.position = Point3D.ZERO;
		reset();
	}

	protected abstract void reset();

}
