package nullobject;

public class Client {

	public static void main(String[] args) {

		ComplexService service = new ComplexService("Simple Report", new StorageService());
		service.generateReport();
		System.out.println("-----------------------------------------");

		service = new ComplexService("Simple Report 2", new NullStorageService());
		service.generateReport();

	}

}
