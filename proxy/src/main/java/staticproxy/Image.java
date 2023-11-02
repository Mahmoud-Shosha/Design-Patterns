package staticproxy;

import javafx.geometry.Point2D;

// The interface that is implemented by real objects and proxy 
public interface Image {

	void setLocation(Point2D location);

	Point2D getLocation();

	void render();

}
