package com.foxminded.anagrams.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.foxminded.anagrams.WordReverser;

public class WordReverserTest {

    @Test
    public void wordReverse_shouldReturnEmptyString_whenEmptyInputGiven() {
	new WordReverser().reverse("");
	Assert.assertEquals("", new WordReverser().reverse(""));
    }

    @Test
    public void wordReverse_shouldReturnSameString_whenInputOnlyNoLetters() {
	new WordReverser().reverse("&4$2-=+");
	Assert.assertEquals("&4$2-=+", new WordReverser().reverse("&4$2-=+"));
    }

    @Test
    public void wordReverse_shouldReturnReverseString_whenInputOnlyLetters() {
	new WordReverser().reverse("ghfjd");
	Assert.assertEquals("djfhg", new WordReverser().reverse("ghfjd"));
    }

    @Test
    public void wordReverse_shouldReturnSmartReverseString_whenInputLettersAndNoLetters() {
	new WordReverser().reverse("dvjn23fkj");
	Assert.assertEquals("jkfn23jvd", new WordReverser().reverse("dvjn23fkj"));
    }

}
