package mediator2.components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import mediator2.mediator.Mediator;

public class DeleteButton extends JButton implements Component {

	private static final long serialVersionUID = 1L;
	private Mediator mediator;

	public DeleteButton() {
		super("Del");
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	protected void fireActionPerformed(ActionEvent actionEvent) {
		mediator.deleteNote();
	}

	@Override
	public String getName() {
		return "DelButton";
	}

}
