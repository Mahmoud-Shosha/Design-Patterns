package abstractfactory;

// It represents a concrete product in a family 'AWS'
public class S3Storage implements Storage {

	public S3Storage(int size) {
		System.out.println(size + " MB allocated on S3Storage");
	}

	@Override
	public String getId() {
		return "S31";
	}

	@Override
	public String toString() {
		return "S3Storage";
	}

}
