package command;

import memento.WorkflowDesigner;
import memento.WorkflowDesigner.Memento;

public abstract class AbstractWorkflowCommand implements WorkflowCommand {

	protected Memento memento;
	protected WorkflowDesigner receiver;

	public AbstractWorkflowCommand(WorkflowDesigner designer) {
		this.receiver = designer;
	}

	@Override
	public void undo() {
		receiver.restore(memento);

	}

}
