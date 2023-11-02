package decorator2.decorators;

public class EncryptionDecorator extends DataSourceDecorator {

	public EncryptionDecorator(DataSource source) {
		super(source);
	}

	@Override
	public void writeData(String data) {
		super.writeData(encode(data));
	}

	@Override
	public String readData() {
		return decode(super.readData());
	}

	private String encode(String data) {
		System.out.println("Encode data ...");
		// Encode data logic ...
		return data;
	}

	private String decode(String data) {
		System.out.println("Decode data ...");
		// Decode data logic ...
		return data;
	}

}
