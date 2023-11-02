package command2.commands;

import command2.editor.Editor;

public class CopyCommand extends Command {

	public CopyCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		editor.clipboard = editor.textField.getSelectedText();
		return false;
	}

}
