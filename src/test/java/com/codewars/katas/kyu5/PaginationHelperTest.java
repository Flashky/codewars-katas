package com.codewars.katas.kyu5;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class PaginationHelperTest {

	private PaginationHelper<Character> helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
	
	@Test
	public void testItemCount() {
		assertEquals(6, helper.itemCount());
	}

	@Test
	public void testPageCount() {
		assertEquals(2, helper.pageCount());
	}

	@Test
	public void testPageItemCount() {
		assertEquals(4, helper.pageItemCount(0));
		assertEquals(2, helper.pageItemCount(1));
		assertEquals(-1	, helper.pageItemCount(2));
	}

	@Test
	public void testPageIndex() {
		assertEquals(1,helper.pageIndex(5));
		assertEquals(0,helper.pageIndex(2));
		assertEquals(-1,helper.pageIndex(20));
		assertEquals(-1,helper.pageIndex(-10));
	}

}
