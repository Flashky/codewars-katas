package com.codewars.katas.kyu7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FunctionalProgrammingTest {

	  @Test
	  public void testJohnSmith() throws Exception {
	    Student jSmith = new Student("John", "Smith", "js123");
	    assertTrue("John Smith with student number js123 did not return true", FunctionalProgramming.f.apply(jSmith));
	  }
	  
	  @Test
	  public void testArea() throws Exception {
	    Triangle t = new Triangle(5, 10);
	    assertEquals("Incorrect area returned", 25D, FunctionalProgramming.g.applyAsDouble(t), 0.001);
	    assertEquals("Incorrect area in Triangle object", 25D, t.getArea(), 0.001);
	  }

}
