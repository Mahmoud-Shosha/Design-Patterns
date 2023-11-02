package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import javafx.geometry.Point2D;
import staticproxy.BitmapImage;

// The InvocationHandler implementation
// Proxy code is written here
public class ImageInvocationHandler implements InvocationHandler {

	private BitmapImage image;
	private Point2D location;
	private String name;
	private final Method setLocationMethod;
	private final Method getLocationMethod;
	private final Method renderMethod;

	public ImageInvocationHandler(String name) {
		this.name = name;
		// Cache methods for later comparison
		try {
			setLocationMethod = Image.class.getMethod("setLocation", new Class[] { Point2D.class });
			getLocationMethod = Image.class.getMethod("getLocation", new Class[] {});
			renderMethod = Image.class.getMethod("render", new Class[] {});
		} catch (NoSuchMethodException e) {
			throw new NoSuchMethodError(e.getMessage());
		}
	}

	// invoke method is called at every proxy method invocation
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.equals(setLocationMethod)) {
			return setLocation(args);
		} else if (method.equals(getLocationMethod)) {
			return getLocationMethodHandler();
		} else if (method.equals(renderMethod)) {
			return renderMethodHandler();
		}
		return null;
	}

	public Object setLocation(Object[] args) {
		if (image != null) {
			image.setLocation((Point2D) args[0]);
		} else {
			this.location = (Point2D) args[0];
		}
		return null;
	}

	public Object getLocationMethodHandler() {
		if (image != null) {
			return image.getLocation();
		} else {
			return location;
		}
	}

	private Object renderMethodHandler() {
		if (image == null) {
			image = new BitmapImage(name);
			if (location != null) {
				image.setLocation(location);
			}
		}
		image.render();
		return null;
	}

}
