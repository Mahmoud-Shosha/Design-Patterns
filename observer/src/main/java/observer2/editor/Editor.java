package observer2.editor;

import java.io.File;

import observer2.publisher.EventManager;

public class Editor {

	public EventManager events;
	private File file;

	public Editor() {
		this.events = new EventManager("open", "save");
	}

	public void openFile(String filePath) {
		this.file = new File(filePath);
		events.notify("open", file);
	}

	public void saveFile() {
		// Save file logic
		events.notify("save", file);
	}

}
