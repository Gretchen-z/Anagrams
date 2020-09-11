package com.foxminded.anagrams.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.foxminded.anagrams.TextReverser;
import com.foxminded.anagrams.WordReverser;

public class TextReverserTest {

    @Test
    public void textReverse_shouldReturnEmptyString_whenEmptyInputGiven() {
	new TextReverser(new WordReverser()).reverse("");
	Assert.assertEquals("", new TextReverser(new WordReverser()).reverse(""));
    }

    @Test
    public void textReverse_shouldReturnSameString_whenInputOnlyNoLetters() {
	new TextReverser(new WordReverser()).reverse("5;#6.%`> *#2 &4$2-=+");
	Assert.assertEquals("5;#6.%`> *#2 &4$2-=+",
		new TextReverser(new WordReverser()).reverse("5;#6.%`> *#2 &4$2-=+"));
    }

    @Test
    public void textReverse_shouldReturnReverseString_whenInputOnlyLetters() {
	new TextReverser(new WordReverser()).reverse("ghfjd fhbvsk ttkdks");
	Assert.assertEquals("djfhg ksvbhf skdktt", 
		new TextReverser(new WordReverser()).reverse("ghfjd fhbvsk ttkdks"));
    }

    @Test
    public void textReverse_shouldReturnSmartReverseString_whenInputLettersAndNoLetters() {
	new TextReverser(new WordReverser()).reverse("dvjn23fkj kfj% gb&f)n");
	Assert.assertEquals("jkfn23jvd jfk% nf&b)g",
		new TextReverser(new WordReverser()).reverse("dvjn23fkj kfj% gb&f)n"));
    }

}
