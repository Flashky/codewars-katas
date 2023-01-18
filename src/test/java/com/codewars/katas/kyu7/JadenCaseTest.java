package com.codewars.katas.kyu7;

import static org.junit.Assert.*;

import org.junit.Test;

public class JadenCaseTest {
	
	private JadenCase jadenCase = new JadenCase();
	
	@Test
	public void test() {
		assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", "Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
	}
	
	@Test
	public void testNullArg() {
		assertNull("Must return null when the arg is null", jadenCase.toJadenCase(null));
	}
	
	@Test
	public void testEmptyArg() {
		assertNull("Must return null when the arg is empty string", jadenCase.toJadenCase(""));
	}

}
