package com.program.general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnagramTest {

    Anagram anagram;

    @BeforeEach
    public void setUp() {
        anagram = new Anagram();
    }

    @Test
    public void  testAnagramTrue(){
        String s = "anagram";
        String t = "nagaram";

        boolean actual = anagram.isAnagram(s,t);
        Assertions.assertEquals(true,actual);

    }

    @Test
    public void  testAnagramFalse(){
        String s = "anagramt";
        String t = "nagaram";

        boolean actual = anagram.isAnagram(s,t);
        Assertions.assertEquals(false,actual);

    }
}
