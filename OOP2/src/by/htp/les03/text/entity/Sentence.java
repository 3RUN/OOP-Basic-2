package by.htp.les03.text.entity;

import java.util.List;

public class Sentence {

	private String sentence = "";

	public Sentence() {
	}

	public Sentence(Word word) {
		this.sentence += word.getWord() + " ";
	}

	public Sentence(List<Word> words) {
		int i = 0;
		for (i = 0; i < words.size(); i++) {
			// get word from the list
			String word = words.get(i).getWord();
			this.sentence += word + " ";
		}
	}

	public void addWord(Word word) {
		this.sentence += word.getWord();
	}

	public String getSentence() {
		return this.sentence;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentence == null) ? 0 : sentence.hashCode());
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
		Sentence other = (Sentence) obj;
		if (sentence == null) {
			if (other.sentence != null)
				return false;
		} else if (!sentence.equals(other.sentence))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sentence [sentence=" + sentence + "]";
	}

}
