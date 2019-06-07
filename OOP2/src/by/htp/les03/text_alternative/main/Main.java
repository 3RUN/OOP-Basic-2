package by.htp.les03.text_alternative.main;

import java.util.*;

import by.htp.les03.text_alternative.entity.Sentence;
import by.htp.les03.text_alternative.entity.Text;
import by.htp.les03.text_alternative.entity.Word;

public class Main {

	public static void main(String[] args) {
		int i = 0;

		// TITLE
		Word[] wordTitle = new Word[4];
		wordTitle[0] = new Word("Here");
		wordTitle[1] = new Word("comes");
		wordTitle[2] = new Word("the");
		wordTitle[3] = new Word("title.");

		List<Word> sTitleWords = new ArrayList<Word>();
		for (i = 0; i < wordTitle.length; i++) {
			sTitleWords.add(wordTitle[i]);
		}

		Sentence sTitle = new Sentence(sTitleWords);
		List<Sentence> title = new ArrayList<Sentence>();
		title.add(sTitle);

		// TEXT
		// Sentence 1
		Word[] wordTextA = new Word[5];
		wordTextA[0] = new Word("This");
		wordTextA[1] = new Word("text");
		wordTextA[2] = new Word("contains");
		wordTextA[3] = new Word("some");
		wordTextA[4] = new Word("words.");

		List<Word> sTextWordsA = new ArrayList<Word>();
		for (i = 0; i < wordTextA.length; i++) {
			sTextWordsA.add(wordTextA[i]);
		}
		Sentence sTextA = new Sentence(sTextWordsA);

		// Sentence 2
		Word[] wordTextB = new Word[2];
		wordTextB[0] = new Word("The");
		wordTextB[1] = new Word("end.");

		List<Word> sTextWordsB = new ArrayList<Word>();
		for (i = 0; i < wordTextB.length; i++) {
			sTextWordsB.add(wordTextB[i]);
		}
		Sentence sTextB = new Sentence(sTextWordsB);

		// Add all sentences into list of sentences
		List<Sentence> text = new ArrayList<Sentence>();
		text.add(sTextA);
		text.add(sTextB);

		// create 'page' with given title and text
		Text page = new Text(title, text);

		// show page on console
		displayPage(page);

		// add some text to text
		Word[] wordAdd = new Word[4];
		wordAdd[0] = new Word("Add");
		wordAdd[1] = new Word("this");
		wordAdd[2] = new Word("to");
		wordAdd[3] = new Word("text.");

		List<Word> wordListAdd = new ArrayList<Word>();
		for (i = 0; i < wordAdd.length; i++) {
			wordListAdd.add(wordAdd[i]);
		}

		Sentence additionalText = new Sentence(wordListAdd);
		page.addToText(additionalText);

		// display text again
		displayPage(page);

	}

	public static void displayPage(Text page) {
		int i = 0;
		int j = 0;
		int k = 0;

		// get title and text
		List<List<Sentence>> list = new ArrayList<List<Sentence>>();
		list.add(page.getTitle());
		list.add(page.getText());

		for (i = 0; i < list.size(); i++) {
			for (j = 0; j < list.get(i).size(); j++) {
				// get word from the sentence
				List<Word> temp = list.get(i).get(j).getSentence();
				for (k = 0; k < temp.size(); k++) {

					// get next word from the word list
					String str = temp.get(k).getWord();
					System.out.print(str + " ");

				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
