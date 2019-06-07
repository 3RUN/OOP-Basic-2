package by.htp.les03.text.main;

import java.util.*;

import by.htp.les03.text.entity.Sentence;
import by.htp.les03.text.entity.Text;
import by.htp.les03.text.entity.Word;

public class Main {

	public static void main(String[] args) {

		int i = 0;

		// words
		// title
		Word[] wordTitle = new Word[4];
		wordTitle[0] = new Word("Here");
		wordTitle[1] = new Word("comes");
		wordTitle[2] = new Word("the");
		wordTitle[3] = new Word("title.");
		List<Word> titleList = new ArrayList<Word>();
		for (i = 0; i < wordTitle.length; i++) {
			titleList.add(wordTitle[i]);
		}

		// text
		Word[] wordText = new Word[7];
		wordText[0] = new Word("This");
		wordText[1] = new Word("text");
		wordText[2] = new Word("contains");
		wordText[3] = new Word("some");
		wordText[4] = new Word("words.");
		wordText[5] = new Word("The");
		wordText[6] = new Word("end.");
		List<Word> textList = new ArrayList<Word>();
		for (i = 0; i < wordText.length; i++) {
			textList.add(wordText[i]);
		}

		// sentences for title and text
		Sentence sentenceTitle = new Sentence(titleList);
		Sentence sentenceText = new Sentence(textList);

		// text itself (contains title and text)
		Text text = new Text(sentenceTitle, sentenceText);

		System.out.println(text.getTitle());
		System.out.println(text.getText() + "\n");

		text.addToTitle("Added another sentence to title!");
		text.addToText("Added another sentence to text!");

		System.out.println(text.getTitle());
		System.out.println(text.getText());

	}

}
