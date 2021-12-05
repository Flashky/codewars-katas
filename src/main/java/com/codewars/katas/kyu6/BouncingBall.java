package com.codewars.katas.kyu6;

/**
 * @author Flashk
 * @see https://www.codewars.com/kata/5544c7a5cb454edb3c000047/train/java
 */
public class BouncingBall {
	
	public static int bouncingBall(double h, double bounce, double window) {
	    
		if(inputIsInvalid(h, bounce, window)) {
			return -1;
		}
	    
		double currentBallHeight = h;
		int countBounces = 0;
		
		while(currentBallHeight > window) {
			
			countBounces++;
			currentBallHeight *= bounce;
			
			if(currentBallHeight > window) {
				countBounces++;
			}
		}
		
		return countBounces;
	}

	private static boolean inputIsInvalid(double h, double bounce, double window) {
		
		if(h <= 0) {
			return true;
		} else if ((bounce <= 0) || (bounce >= 1)) {
			return true;
		} else if (window >= h) {
			return true;
		}
		
		return false;
	}
}
