package command;

import memento.WorkflowDesigner;

public class CreateCommand extends AbstractWorkflowCommand {

	private String name;

	public CreateCommand(WorkflowDesigner designer, String name) {
		super(designer);
		this.name = name;
	}

	@Override
	public void execute() {
		this.memento = this.receiver.save();
		this.receiver.createWorkflow(name);
	}

}
