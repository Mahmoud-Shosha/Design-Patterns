package bridge;

public class Main {

	public static void main(String[] args) {
		FifoCollection<Integer> collection = new Queue<Integer>(new SinglyLinkedList<>());
		collection.offer(10);
		collection.offer(40);
		collection.offer(99);
		System.out.println(collection.poll());
		System.out.println(collection.poll());
		System.out.println(collection.poll());
		System.out.println(collection.poll());
	}

}
