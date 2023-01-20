package com.codewars.katas.kyu7;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;

/**
 * <strong>Functional Programming Katas:</strong>
 * <ul>
 * <li><a href="https://www.codewars.com/kata/54a6b43e478d8ee14c000a5d/solutions/java">Part 1: The Beginning</a></li>
 * <li><a href="https://www.codewars.com/kata/54a6c6e7478d8ee02d000cd9/solutions/java">Part 2: Multiline Functions</a></li>
 * <li><a href="https://www.codewars.com/kata/54a6d39a478d8e07e4000b69/train/java">Part 3: Closured for Business</a> (see {@link AdderFactory})</li>
 * </ul>
 */
public class FunctionalProgramming {
	public static Function<Student, Boolean> f = s -> "John Smith".equals(s.getFullName()) && "js123".equals(s.studentNumber); 
	public static ToDoubleFunction<Triangle> g = t -> {
		t.setArea(0.5 * t.base * t.height);
		return t.getArea();
	};
}
