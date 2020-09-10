package task1;
import java.util.StringJoiner;

public class TextReverser implements TextChanger {
    static String SEPARATOR = " ";

    @Override
    public String changeText(String inputText) {
	String[] words = inputText.split(SEPARATOR);
	StringJoiner textAnagrams = new StringJoiner(SEPARATOR);

	for (int i = 0; i < words.length; i++) {
	    textAnagrams.add(new WordReverser().changeWord(words[i]));
	}
	return textAnagrams.toString();
    }
}
