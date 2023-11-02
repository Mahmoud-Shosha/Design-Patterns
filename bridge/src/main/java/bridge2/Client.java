package bridge2;

import bridge2.devices.Device;
import bridge2.devices.Radio;
import bridge2.devices.Tv;
import bridge2.remotes.AdvancedRemote;
import bridge2.remotes.BasicRemote;

public class Client {

	public static void main(String[] args) {
		testDevice(new Tv());
		testDevice(new Radio());
	}

	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		device.printStatus();

		System.out.println("Tests with advanced remote.");
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.power();
		advancedRemote.mute();
		device.printStatus();
	}

}
