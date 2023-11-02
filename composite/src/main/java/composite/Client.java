package composite;

public class Client {

	public static void main(String[] args) {
		// Whether the File is BinaryFile or Directory, we CAN call ls() safely
		File root1 = createTreeOne();
		root1.ls();
		System.out.println("---------------");

		File root2 = createTreeTwo();
		root2.ls();
	}

	// Client builds tree using Leaf and Composite
	private static File createTreeOne() {
		BinaryFile file1 = new BinaryFile("File1", 1000);
		Directory dir1 = new Directory("Dir1");
		dir1.addFile(file1);
		BinaryFile file2 = new BinaryFile("File2", 2000);
		BinaryFile file3 = new BinaryFile("File3", 150);
		Directory dir2 = new Directory("Dir2");
		dir2.addFile(file2);
		dir2.addFile(file3);
		dir2.addFile(dir1);
		return dir2;
	}

	// Client builds tree using Leaf and Composite
	private static File createTreeTwo() {
		return new BinaryFile("Another file", 200);
	}

}
