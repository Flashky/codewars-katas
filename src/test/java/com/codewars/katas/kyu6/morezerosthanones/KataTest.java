package com.codewars.katas.kyu6.morezerosthanones;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class KataTest {

    @Test
    public void basicTests() {
      assertArrayEquals(new char[] {'a','b','d'}, Kata.moreZeros("abcde"));
      assertArrayEquals(new char[] {'h', 'b', 'p', 'a', 'd'}, Kata.moreZeros("thequickbrownfoxjumpsoverthelazydog"));
      assertArrayEquals(new char[] {'T','H','E','Q','I','C','B','R','F','X','J','P','L', 'A','D'}, Kata.moreZeros("THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG"));
      assertArrayEquals(new char[] {'a','b','d','h','p','A','B','C','D','E','F','H','I','J','L','P','Q','R','T','X','0'}, Kata.moreZeros("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890_"));
      assertArrayEquals(new char[] {'D', 'I', 'E', 'T'}, Kata.moreZeros("DIGEST"));
    }
}
