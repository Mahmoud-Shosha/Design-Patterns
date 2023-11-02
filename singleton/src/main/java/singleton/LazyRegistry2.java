package singleton;

//It uses lazy singleton
public class LazyRegistry2 {

	private LazyRegistry2() {
		System.out.println("LazyRegistry2 created !");
	}

	private static class LazyRegistry2Holder {
		static final LazyRegistry2 INSTANCE = new LazyRegistry2();
	}

	public static LazyRegistry2 getInstance() {
		return LazyRegistry2Holder.INSTANCE;
	}

}
