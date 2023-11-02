package builder3.builders;

import builder3.cars.CarType;
import builder3.components.Engine;
import builder3.components.GPSNavigator;
import builder3.components.Transmission;
import builder3.components.TripComputer;

public interface Builder {

	void setCarType(CarType type);

	void setSeats(int seats);

	void setEngine(Engine engine);

	void setTransmission(Transmission transmission);

	void setTripComputer(TripComputer tripComputer);

	void setGPSNavigator(GPSNavigator gpsNavigator);

}
