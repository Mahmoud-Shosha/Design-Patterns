package decorator;

import org.apache.commons.text.StringEscapeUtils;

// This is a decorator class for Message interface
public class HTMLEncodedMessage implements Message {

	private Message msg;

	public HTMLEncodedMessage(Message msg) {
		this.msg = msg;
	}

	@Override
	public String getContent() {
		return StringEscapeUtils.escapeHtml4(msg.getContent());
	}

}
