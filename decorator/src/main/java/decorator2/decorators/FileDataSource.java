package decorator2.decorators;

public class FileDataSource implements DataSource {

	private String name;
	private String dummmayCache;

	public FileDataSource(String name) {
		this.name = name;
	}

	@Override
	public void writeData(String data) {
		System.out.println("Writting to file " + name);
		dummmayCache = data;
		// File writing data logic ...
	}

	@Override
	public String readData() {
		System.out.println("Reading form file " + name);
		// File reading data logic ...
		return dummmayCache;
	}

}
