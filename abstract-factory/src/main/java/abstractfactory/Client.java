package abstractfactory;

import abstractfactory.Instance.Capacity;

public class Client {

	private ResourceFactory resourceFactory;

	public Client(ResourceFactory resourceFactory) {
		this.resourceFactory = resourceFactory;
	}

	public Instance createServer(Capacity capacity, int size) {
		Instance instance = resourceFactory.createInstance(capacity);
		Storage storage = resourceFactory.createStorage(size);
		instance.attachStorage(storage);
		return instance;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("-------> Using AWS");
		Client aws = new Client(new AWSResourceFactory());
		Instance i1 = aws.createServer(Capacity.micro, 20480);
		i1.start();
		i1.start();
		System.out.println("-------> Using Google Cloud Platform");
		Client gcp = new Client(new GoogleCloudResourceFactory());
		Instance i2 = gcp.createServer(Capacity.large, 20480);
		i2.start();
		i2.start();
	}

}
