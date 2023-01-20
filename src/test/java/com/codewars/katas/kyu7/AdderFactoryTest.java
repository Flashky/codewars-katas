package com.codewars.katas.kyu7;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdderFactoryTest {

	  @Test
	  public void testMakeFunction() throws Exception {
	    assertEquals("Created add 1 function; gave it 4; did not get 5 back",
	                 5, AdderFactory.create(1).applyAsInt(4));
	  }

}
