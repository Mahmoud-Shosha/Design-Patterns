package bridge;

// This is the Abstraction interface
public interface FifoCollection<T> {

	void offer(T element);

	T poll();

}
