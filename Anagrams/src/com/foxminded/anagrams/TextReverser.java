package com.foxminded.anagrams;
import java.util.StringJoiner;

public class TextReverser implements Reverser {
    private static final String SEPARATOR = " ";
    private Reverser wordReverser;

    public TextReverser(Reverser wordReverser) {
	this.wordReverser = wordReverser;
    }

    @Override
    public String reverse(String inputText) {
	StringJoiner textAnagrams = new StringJoiner(SEPARATOR);

	for (String word : inputText.split(SEPARATOR)) {
	    textAnagrams.add(wordReverser.reverse(word));
	}
	return textAnagrams.toString();
    }
}
