package command;

import memento.WorkflowDesigner;

public class AddStepCommand extends AbstractWorkflowCommand {

	private String step;

	public AddStepCommand(WorkflowDesigner designer, String step) {
		super(designer);
		this.step = step;
	}

	@Override
	public void execute() {
		this.memento = this.receiver.save();
		this.receiver.addStep(step);
	}

}
