package com.Saurabh.GitHubAiAPI;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringOperationsTest {


    @BeforeAll
    public static void setUp() {
        // TO DO
    }

    // To DO
    // test to check if the count of vwels is correct
    @Test
    public void testCountVowels_noVowels() {

        assertEquals(0, StringOperations.countVowels("bcdfg"));
    }


    @Test
    public void testCountVowels_emptyString() {
        assertEquals(0, StringOperations.countVowels(""));
    }

    @Test
    public void testCountVowels_onlyVowels() {
        assertEquals(10, StringOperations.countVowels("aeiouAEIOU"));
    }

    @Test
    public void testReverseString() {
        assertEquals("olleh", StringOperations.reverseString("hello"));
    }

    @Test
    public void testReverseString_emptyString() {
        assertEquals("", StringOperations.reverseString(""));
    }

    @Test
    public void testReverseString_singleCharacter() {
        assertEquals("a", StringOperations.reverseString("a"));
    }

    @Test
    public void testReplaceCharacters_withVowels() {
        assertEquals("h*ll*", StringOperations.replaceCharacters("hello"));
    }

    @Test
    public void testReplaceCharacters_noVowels() {
        assertEquals("bcdfg", StringOperations.replaceCharacters("bcdfg"));
    }


    @Test
    public void testReplaceCharacters_emptyString() {
        assertEquals("", StringOperations.replaceCharacters(""));
    }

    @Test
    public void testConcatenateStrings() {
        assertEquals("helloolleh", StringOperations.concatenateStrings("hello", "olleh"));
    }

    @Test
    public void testConcatenateStrings_emptyStrings() {
        assertEquals("", StringOperations.concatenateStrings("", ""));
    }

    @Test
    public void testConcatenateStrings_firstEmpty() {
        assertEquals("olleh", StringOperations.concatenateStrings("", "olleh"));
    }

    @Test
    public void testConcatenateStrings_secondEmpty() {
        assertEquals("hello", StringOperations.concatenateStrings("hello", ""));
    }

    @Test
    void testCountVowels_nullInput() {
        assertThrows(NullPointerException.class, () -> StringOperations.countVowels(null));
    }

    @Test
    void testReverseString_nullInput() {
        assertThrows(NullPointerException.class, () -> StringOperations.reverseString(null));
    }

    @Test
    void testReplaceCharacters_nullInput() {
        assertThrows(NullPointerException.class, () -> StringOperations.replaceCharacters(null));
    }


}
