package com.codewars.katas.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BasicOperationsTest {

	  @Test
	  public void testBasics()
	  {
	    System.out.println("Basic Tests");
	    assertEquals((Integer) 11, BasicOperations.basicMath("+", 4, 7));
	    assertEquals(Integer.valueOf(-3), BasicOperations.basicMath("-", 15, 18));
	    assertEquals((Integer) 25, BasicOperations.basicMath("*", 5, 5));
	    assertEquals((Integer) 7, BasicOperations.basicMath("/", 49, 7));
	  }

}
