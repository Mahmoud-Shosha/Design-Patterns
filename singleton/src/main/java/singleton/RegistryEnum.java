package singleton;

// It uses enum singleton
public enum RegistryEnum {

	INSTANCE;

	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
