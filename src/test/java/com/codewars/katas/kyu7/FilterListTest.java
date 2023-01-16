package com.codewars.katas.kyu7;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class FilterListTest {

	@Test
	public void testFilterList() {
		
		List<Object> result = FilterList.filterList(List.of(1, 2, "a", "b"));
		
		assertEquals(1,result.get(0));
		assertEquals(2,result.get(1));
		
		result = FilterList.filterList(List.of(1, 2, "a", "b", 0, 15));
		
		assertEquals(1,result.get(0));
		assertEquals(2,result.get(1));
		assertEquals(0,result.get(2));
		assertEquals(15,result.get(3));
		
		result = FilterList.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231));
		
		assertEquals(1,result.get(0));
		assertEquals(2,result.get(1));
		assertEquals(231,result.get(2));
	}

}
