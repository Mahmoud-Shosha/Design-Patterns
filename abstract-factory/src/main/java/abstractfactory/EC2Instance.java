package abstractfactory;

// It represents a concrete product in a family 'AWS'
public class EC2Instance implements Instance {

	public EC2Instance(Capacity capacity) {
		System.out.println("EC2Instance Created");
	}

	@Override
	public void start() {
		System.out.println("EC2Instance started");

	}

	@Override
	public void stop() {
		System.out.println("EC2Instance stoped");

	}

	@Override
	public void attachStorage(Storage storage) {
		System.out.println(storage + " attached to EC2Instance");
	}

	@Override
	public String toString() {
		return "EC2Instance";
	}

}
