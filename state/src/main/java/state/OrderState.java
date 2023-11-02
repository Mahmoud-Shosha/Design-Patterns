package state;

// It represents the State interface
public interface OrderState {

	// It process cancellation and return cancellation fees
	double handleCancellation();

}
