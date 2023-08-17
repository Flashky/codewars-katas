package com.codewars.katas.kyu8;

public class BasicOperations {
	public static Integer basicMath(String op, int v1, int v2) {
		switch(op) {
			case "+": return v1+v2;
			case "-": return v1-v2;
			case "*": return v1*v2;
			case "/": return v1/v2;
		}
		return -1;
	}
	
	// Soluciones interesantes:
	// Hice este problema tan básico porque me resultaba interesante averiguar que soluciones ingeniosas
	// idearía la gente.
	// La única solución que me ha sorprendido es esta que hace uso de un mapa en el que guarda un IntBinaryOperator:
	// https://www.codewars.com/kata/reviews/58ee7c4f62f7eaa01800131c/groups/58ef5cfe181243b804000825
	// 
	// Esta solución me ha permitido aprender que es posible guardar funciones en mapas.
	// Debería aprender más acerca del uso de clases como:
	// - IntBinaryOperator
	// - IntUnaryOperator
	// - LongBinaryOperator
	// - LongUnaryOperator
	// - DoubleBinaryOperator
	// - DoubleUnaryOperator
	
	// Y en general de clases de java.util.function y de lambdas:
	// http://www.java2s.com/Tutorials/Java/Java_Lambda/index.htm
}
