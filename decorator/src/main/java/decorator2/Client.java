package decorator2;

import decorator2.decorators.CompressionDecorator;
import decorator2.decorators.DataSourceDecorator;
import decorator2.decorators.EncryptionDecorator;
import decorator2.decorators.FileDataSource;

public class Client {

	public static void main(String[] args) {
		String salaryRecords = "Hello, I am Mahmoud !";
		DataSourceDecorator encoded = new CompressionDecorator(
				new EncryptionDecorator(new FileDataSource("output.txt")));

		System.out.println("------- WRITING TO DATASOURCE");
		System.out.println(salaryRecords);
		encoded.writeData(salaryRecords);
		System.out.println("------- READING FROM DATASOURCE");
		System.out.println(encoded.readData());
	}

}
