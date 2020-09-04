import java.util.Scanner;

public class MakeAnagrams {
	
static String smartReverse(String inputText) {
		
		String[] words = inputText.split(" ");

		for(int i = 0; i < words.length; i++) {
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
			words[i] = String.valueOf(word);
		}
		
		String anagrams = String.join(" ", words);
		return anagrams;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputText = scanner.nextLine();
		
		System.out.println(smartReverse(inputText));
		}
		
}
