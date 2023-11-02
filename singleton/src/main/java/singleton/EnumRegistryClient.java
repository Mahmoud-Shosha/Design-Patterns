package singleton;

public class EnumRegistryClient {

	public static void main(String[] args) {
		RegistryEnum singleton = RegistryEnum.INSTANCE;
		System.out.println(singleton);
		System.out.println(singleton.getValue());
		singleton.setValue(2);
		singleton = RegistryEnum.INSTANCE;
		System.out.println(singleton.getValue());
		System.out.println(singleton);
	}

}
