package prototype;

// Assume that this class does not support cloning
// may be the general unit is a unique unit
// in our game so we do not need copies of it
public class General extends GameUnit {

	private String state = "idle";

	public void boostMorale() {
		this.state = "MoralBoost";
	}

	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Generals are unique");
	}

	@Override
	protected void reset() {
		throw new UnsupportedOperationException("Reset not supported");
	}

	@Override
	public String toString() {
		return "General " + state + " @ " + getPosition();
	}

}
