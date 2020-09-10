package task1;
public class WordReverser implements WordChanger {
    @Override
    public String changeWord(String str) {
	char[] word = str.toCharArray();
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
