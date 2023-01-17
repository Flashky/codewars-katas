package com.codewars.katas.kyu6;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordScoreTest {

	@Test
	public void testHigh() {
		assertEquals("abad", WordScore.high("abad"));
		assertEquals("taxi", WordScore.high("man i need a taxi up to ubud"));
        assertEquals("volcano", WordScore.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", WordScore.high("take me to semynak"));
	}

}
