package mediator2;

import javax.swing.DefaultListModel;

import mediator2.components.AddButton;
import mediator2.components.DeleteButton;
import mediator2.components.Filter;
import mediator2.components.List;
import mediator2.components.SaveButton;
import mediator2.components.TextBox;
import mediator2.components.Title;
import mediator2.mediator.Editor;
import mediator2.mediator.Mediator;
import mediator2.mediator.Note;

public class Client {

	public static void main(String[] args) {
		Mediator mediator = new Editor();

		mediator.registerComponent(new Title());
		mediator.registerComponent(new TextBox());
		mediator.registerComponent(new AddButton());
		mediator.registerComponent(new DeleteButton());
		mediator.registerComponent(new SaveButton());
		mediator.registerComponent(new List(new DefaultListModel<Note>()));
		mediator.registerComponent(new Filter());

		mediator.createGUI();
	}

}
