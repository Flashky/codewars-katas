package com.codewars.katas.kyu6;

public class DigitalRoot {

	  public static int digitalRoot(int n) {
		  
		  if(n < 10) {
			  return n;
		  }
		  
		  return digitalRoot((n % 10) + digitalRoot(n / 10));

	  }

	  // Other solutions: https://www.codewars.com/kata/541c8630095125aba6000c00/solutions/java

}
