package bridge;

// This is the Implementor interface
public interface LinkedList<T> {

	void addFirst(T element);

	T removeFirst();

	void addLast(T element);

	T removeLast();

	int getSize();

}