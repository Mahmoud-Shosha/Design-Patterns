package singleton;

public class LazyRegistryClient2 {

	public static void main(String[] args) {
		// Compiler error: The constructor LazyRegistry2() is not visible
		// LazyRegistry2 registry = new LazyRegistry2();
		// Compiler error: The type LazyRegistry2.LazyRegistry2Holder is not visible
		// LazyRegistry2.LazyRegistry2Holder holder;
		// Loading the lazy class will not load the inner class
		LazyRegistry2 registry1;
		System.out.println("--------------");
		registry1 = LazyRegistry2.getInstance();
		LazyRegistry2 registry2 = LazyRegistry2.getInstance();
		System.out.println(registry1);
		System.out.println(registry2);
		System.out.println(registry1 == registry2);
	}

}
