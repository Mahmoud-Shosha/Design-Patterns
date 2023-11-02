package abstractfactory;

import abstractfactory.Instance.Capacity;

// Factory implementation for 'Google Cloud' family
public class GoogleCloudResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int size) {
		return new GoogleCloudStorage(size);
	}

}
