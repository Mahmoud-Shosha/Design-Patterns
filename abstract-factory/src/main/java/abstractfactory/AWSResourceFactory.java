package abstractfactory;

import abstractfactory.Instance.Capacity;

// Factory implementation for 'AWS' family
public class AWSResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new EC2Instance(capacity);
	}

	@Override
	public Storage createStorage(int size) {
		return new S3Storage(size);
	}

}
