package com.codewars.katas.kyu5;

/**
 * <strong>Kata:</strong> <a href="https://www.codewars.com/kata/5282b48bb70058e4c4000fa7/train/java">Convert A Hex String to RGB</a>
 * @author bruizv
 *
 */
public class HexToRGB {
	 
	public static int[] hexStringToRGB(String hex) {
	    
		int[] rgb = new int[3];
		rgb[0] = Integer.parseInt(hex.substring(1,3), 16);
		rgb[1] = Integer.parseInt(hex.substring(3,5), 16);
		rgb[2] = Integer.parseInt(hex.substring(5,7), 16);
		
	    return rgb;
	    
	}
	
	// Soluciones interesantes:
	// - Usando java.awt.Color:
	// 		Color color = Color.decode(hex);
    // 		return new int[] {color.getRed(), color.getGreen(), color.getBlue()};    
	
	
}
