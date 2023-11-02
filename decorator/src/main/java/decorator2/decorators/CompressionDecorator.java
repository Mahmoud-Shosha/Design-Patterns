package decorator2.decorators;

public class CompressionDecorator extends DataSourceDecorator {

	public CompressionDecorator(DataSource source) {
		super(source);
	}

	@Override
	public void writeData(String data) {
		super.writeData(compress(data));
	}

	@Override
	public String readData() {
		return decompress(super.readData());
	}

	private String compress(String stringData) {
		System.out.println("Compress data ...");
		// Compress data logic ...
		return stringData;
	}

	private String decompress(String stringData) {
		System.out.println("Decompress data ...");
		// Decompress data logic ...
		return stringData;
	}

}
