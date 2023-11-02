package mediator2.components;

import mediator2.mediator.Mediator;

public interface Component {

	void setMediator(Mediator mediator);

	String getName();

}
