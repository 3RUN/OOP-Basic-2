package by.htp.les03.text.entity;

import java.util.List;

public class Text {

	private String title = "";
	private String text = "";

	public Text() {
	}

	public Text(Sentence title, Sentence text) {
		this.title = title.getSentence();
		this.text = text.getSentence();
	}

	public Text(List<Sentence> title, List<Sentence> text) {
		int i = 0;
		for (i = 0; i < title.size(); i++) {
			String sentence = title.get(i).getSentence();
			this.title += sentence + " ";
		}

		for (i = 0; i < text.size(); i++) {
			String sentence = text.get(i).getSentence();
			this.text += sentence + " ";
		}
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void addToTitle(String title) {
		this.title += title;
	}

	public void addToText(String text) {
		this.text += text;
	}

	public String getTitle() {
		return this.title;
	}

	public String getText() {
		return this.text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Text [title=" + title + ", text=" + text + "]";
	}

}
