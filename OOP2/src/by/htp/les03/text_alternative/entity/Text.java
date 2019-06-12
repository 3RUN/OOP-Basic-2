package by.htp.les03.text_alternative.entity;

import java.util.List;

public class Text {

	private List<Sentence> title;
	private List<Sentence> text;

	public Text() {
	}

	public Text(List<Sentence> title, List<Sentence> text) {
		this.title = title;
		this.text = text;
	}

	public void setTitle(List<Sentence> title) {
		this.title = title;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}

	public void addToTitle(Sentence title) {
		this.title.add(title);
	}

	public void addToText(Sentence text) {
		this.text.add(text);
	}

	public List<Sentence> getTitle() {
		return this.title;
	}

	public List<Sentence> getText() {
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
