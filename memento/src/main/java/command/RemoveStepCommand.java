package command;

import memento.WorkflowDesigner;

public class RemoveStepCommand extends AbstractWorkflowCommand {

	private String step;

	public RemoveStepCommand(WorkflowDesigner designer, String step) {
		super(designer);
		this.step = step;
	}

	@Override
	public void execute() {
		this.memento = this.receiver.save();
		this.receiver.removeStep(step);
	}

}
