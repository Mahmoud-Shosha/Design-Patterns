package observer2;

import observer2.editor.Editor;
import observer2.listener.EmailNotificationListener;
import observer2.listener.LogOpenListener;

public class Client {

	public static void main(String[] args) {
		Editor editor = new Editor();
		editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
		editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

		editor.openFile("test.txt");
		editor.saveFile();
	}

}
