package abstractfactory;

import abstractfactory.Instance.Capacity;

// Abstract factory with methods defined for each product type
public interface ResourceFactory {

	Instance createInstance(Capacity capacity);

	Storage createStorage(int size);

}
