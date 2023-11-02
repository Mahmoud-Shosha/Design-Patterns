package singleton;

//It uses lazy singleton
public class LazyRegistry {

	private static volatile LazyRegistry INSTANCE;

	private LazyRegistry() {

	}

	public static LazyRegistry getInstance() {
		if (INSTANCE == null) {
			// This takes a lock at the entire class
			synchronized (LazyRegistry.class) {
				if (INSTANCE == null) {
					INSTANCE = new LazyRegistry();
				}
			}
		}
		return INSTANCE;
	}

}
