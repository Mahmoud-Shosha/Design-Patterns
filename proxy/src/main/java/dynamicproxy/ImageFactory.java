package dynamicproxy;

import java.lang.reflect.Proxy;

// Factory class to get Image objects
public class ImageFactory {

	public static Image getImage(String name) {
		return (Image) Proxy.newProxyInstance(
				ImageFactory.class.getClassLoader(),
				new Class[] { Image.class },
				new ImageInvocationHandler(name));
	}

}
