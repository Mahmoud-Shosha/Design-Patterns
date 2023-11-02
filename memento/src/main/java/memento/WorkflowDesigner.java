package memento;

// It represents the originator class
public class WorkflowDesigner {

	private Workflow workflow;

	public void createWorkflow(String name) {
		workflow = new Workflow(name);
	}

	public Workflow getWorkflow() {
		return this.workflow;
	}

	public Memento save() {
		if (workflow == null) {
			return new Memento();
		} else {
			return new Memento(workflow.getSteps(), workflow.getName());
		}
	}

	public void restore(Memento memento) {
		if (memento.getSteps() == null && memento.getName() == null) {
			this.workflow = null;
		} else {
			this.workflow = new Workflow(memento.getName(), memento.getSteps());
		}
	}

	public void addStep(String step) {
		workflow.addStep(step);
	}

	public void removeStep(String step) {
		workflow.removeStep(step);
	}

	public void print() {
		System.out.println(workflow);
	}

	public static class Memento {

		private String[] steps;
		private String name;

		private Memento() {
		}

		private Memento(String[] steps, String name) {
			this.steps = steps;
			this.name = name;
		}

		private String[] getSteps() {
			return steps;
		}

		private String getName() {
			return name;
		}

	}

}
