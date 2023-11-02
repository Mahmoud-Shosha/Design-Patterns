package singleton;

public class LazyRegistryClient {

	public static void main(String[] args) {
		// Compiler error: The constructor LazyRegistry() is not visible
		// LazyRegistry registry = new LazyRegistry();
		LazyRegistry registry1 = LazyRegistry.getInstance();
		LazyRegistry registry2 = LazyRegistry.getInstance();
		LazyRegistry registry3 = LazyRegistry.getInstance();
		System.out.println(registry1);
		System.out.println(registry2);
		System.out.println(registry3);
		System.out.println(registry1 == registry2);
		System.out.println(registry2 == registry3);
	}

}
