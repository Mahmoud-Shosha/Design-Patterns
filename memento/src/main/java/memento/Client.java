package memento;

import java.util.LinkedList;

import command.AddStepCommand;
import command.CreateCommand;
import command.WorkflowCommand;

public class Client {

	public static void main(String[] args) {
		WorkflowDesigner designer = new WorkflowDesigner();
		LinkedList<WorkflowCommand> commands = runCommands(designer);
		designer.print();
		commands.removeLast().undo();
		designer.print();
		commands.removeLast().undo();
		designer.print();
		commands.removeLast().undo();
		designer.print();
		commands.removeLast().undo();
		designer.print();

	}

	private static LinkedList<WorkflowCommand> runCommands(WorkflowDesigner designer) {
		// We use linked list to track the executed commands in order
		LinkedList<WorkflowCommand> commands = new LinkedList<>();

		WorkflowCommand cmd = new CreateCommand(designer, "Leave Workflow");
		commands.addLast(cmd);
		cmd.execute();

		cmd = new AddStepCommand(designer, "Create Leave Application");
		commands.addLast(cmd);
		cmd.execute();

		cmd = new AddStepCommand(designer, "Submit Application");
		commands.addLast(cmd);
		cmd.execute();

		cmd = new AddStepCommand(designer, "Application Approved");
		commands.addLast(cmd);
		cmd.execute();

		return commands;
	}
}