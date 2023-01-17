package com.codewars.katas.kyu7;

import java.util.List;
import java.util.stream.Collectors;

public class FilterList {
	
	public static List<Object> filterList(final List<Object> list) {
		
		// Return the List with the Strings filtered out
		return list.stream().filter(obj -> obj instanceof Integer).collect(Collectors.toList());
		
		// Improvements:
		// Filter using class isInstance(Object) method: .filter(Integer.class::isInstance)
		
		// Only Java 16:
		// - When collecting to a list, use toList() instead of .collect(Collectors.ToList());
		// - The result list will be immutable when using that method.
		// 
		// Therefore:
		// list.stream().filter(Integer.class::isInstance).toList();
	}
	  
}
