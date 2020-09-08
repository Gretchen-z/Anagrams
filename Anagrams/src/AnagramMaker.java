import java.util.StringJoiner;

class AnagramMaker implements IAnagramMaker {

    @Override
    public String makeAnagram(String inputText) {

	String[] words = inputText.split(" ");

	StringJoiner anagramsOfText = new StringJoiner(" ");

	for (int i = 0; i < words.length; i++) {
	    char[] word = words[i].toCharArray();
	    char tmp;
	    int beginPosition = 0;
	    int endPosition = word.length - 1;

	    while (beginPosition < endPosition) {
		if (!Character.isLetter(word[beginPosition])) {
		    beginPosition++;
		} else if (!Character.isLetter(word[endPosition])) {
		    endPosition--;
		} else {
		    tmp = word[beginPosition];
		    word[beginPosition] = word[endPosition];
		    word[endPosition] = tmp;
		    endPosition--;
		    beginPosition++;
		}
	    }
	    anagramsOfText.add(String.valueOf(word));
	}

	return anagramsOfText.toString();
    }
}
