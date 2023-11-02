package singleton;

public class EagerRegistryClient {

	public static void main(String[] args) {
		// Compiler error: The constructor EagerRegistry() is not visible
		// EagerRegistry registry = new EagerRegistry();
		EagerRegistry registry1 = EagerRegistry.getInstance();
		EagerRegistry registry2 = EagerRegistry.getInstance();
		EagerRegistry registry3 = EagerRegistry.getInstance();
		System.out.println(registry1);
		System.out.println(registry2);
		System.out.println(registry3);
		System.out.println(registry1 == registry2);
		System.out.println(registry2 == registry3);
	}

}
