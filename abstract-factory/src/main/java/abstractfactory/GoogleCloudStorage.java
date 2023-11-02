package abstractfactory;

// It represents a concrete product in a family 'Google Cloud'
public class GoogleCloudStorage implements Storage {

	public GoogleCloudStorage(int size) {
		System.out.println(size + " MB allocated on GoogleCloudStorage");
	}

	@Override
	public String getId() {
		return "GoogleCloudStorage1";
	}

	@Override
	public String toString() {
		return "GoogleCloudStorage";
	}
}
