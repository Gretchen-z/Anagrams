package com.foxminded.anagrams;

public class ReverserWord implements Reverser {
    @Override
    public String reverse(String string) {
	char[] word = string.toCharArray();
	int beginPosition = 0;
	int endPosition = word.length - 1;

	while (beginPosition < endPosition) {
	    if (!Character.isLetter(word[beginPosition])) {
		beginPosition++;
	    } else if (!Character.isLetter(word[endPosition])) {
		endPosition--;
	    } else {
		char tmp = word[beginPosition];
		word[beginPosition] = word[endPosition];
		word[endPosition] = tmp;
		endPosition--;
		beginPosition++;
	    }
	}
	return String.valueOf(word);
    }
}
