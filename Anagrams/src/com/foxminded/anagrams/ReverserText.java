package com.foxminded.anagrams;
import java.util.StringJoiner;

public class ReverserText implements Reverser {
    private static final String SEPARATOR = " ";
    private Reverser wordReverser;

    ReverserText(Reverser wordReverser) {
	this.wordReverser = wordReverser;
    }

    @Override
    public String reverse(String inputText) {
	StringJoiner textAnagrams = new StringJoiner(SEPARATOR);

	for (String words : inputText.split(SEPARATOR)) {
	    textAnagrams.add(wordReverser.reverse(words));
	}
	return textAnagrams.toString();
    }
}
