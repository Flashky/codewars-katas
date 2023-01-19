package com.codewars.katas.kyu6;

import java.math.BigInteger;

public class ASum {
	
	public static long findNb(long m) {
		
		// Solution using BigInteger
		
		BigInteger mb = BigInteger.valueOf(m);
		BigInteger n = BigInteger.ZERO;
		BigInteger base = BigInteger.ZERO;
		BigInteger pow;
		
		while (mb.compareTo(n) > 0) {
			base = base.add(BigInteger.ONE);
			pow = base.pow(3);
			n = n.add(pow);
		}

		return (mb.compareTo(n) == 0) ? base.longValue() : -1;
	}	
	
	public static long findNbLong(long m) {
		
		// Solution using primitive long
	    
		long n = 0;
		long base = 0;
			
		while (n < m) {
			n += (long) Math.pow(++base,3);
		}

		return n == m ? base : -1;
	}
	
}
