package objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

// Using generics to be reusable
public class ObjectPool<T extends Poolable> {

	// It represents our in-memory cache
	private BlockingQueue<T> pool;

	public ObjectPool(Supplier<T> creator, int count) {
		// An optionally-bounded blocking queue based on linked nodes
		// The optional capacity bound constructor argument serves as a way to prevent
		// excessive queue expansion
		// The capacity, if unspecified, is equal to Integer.MAX_VALUE
		// Linked nodes are dynamically created upon each insertion unless this would
		// bring the queue above capacity
		this.pool = new LinkedBlockingQueue<T>();
		for (int i = 0; i < count; i++) {
			release(creator.get());
		}
	}

	public T get() {
		try {
			// take() method throws: InterruptedException - if interrupted while waiting
			return pool.take();
		} catch (InterruptedException e) {
			System.err.println("take() was interrupted");
		}
		return null;
	}

	public void release(T object) {
		object.reset();
		try {
			// put() method throws: InterruptedException - if interrupted while waiting
			pool.put(object);
		} catch (InterruptedException e) {
			System.err.println("take() was interrupted");
		}
	}

}
