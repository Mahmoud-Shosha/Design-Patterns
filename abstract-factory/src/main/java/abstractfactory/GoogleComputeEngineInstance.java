package abstractfactory;

// It represents a concrete product in a family 'Google Cloud'
public class GoogleComputeEngineInstance implements Instance {

	public GoogleComputeEngineInstance(Capacity capacity) {
		System.out.println("GoogleComputeEngineInstance Created");
	}

	@Override
	public void start() {
		System.out.println("GoogleComputeEngineInstance started");

	}

	@Override
	public void stop() {
		System.out.println("GoogleComputeEngineInstance stoped");

	}

	@Override
	public void attachStorage(Storage storage) {
		System.out.println(storage + " attached to GoogleComputeEngineInstance");
	}

	@Override
	public String toString() {
		return "GoogleComputeEngineInstance";
	}

}
