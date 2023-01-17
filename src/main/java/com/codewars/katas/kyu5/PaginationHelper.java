package com.codewars.katas.kyu5;

import java.util.List;

/**
 * <strong>Kata:</strong> <a href="https://www.codewars.com/kata/515bb423de843ea99400000a/train/java">PaginationHelper</a>
 */
public class PaginationHelper<I> {
	
	private List<I> items;
	private int pageSize;
	private int pageCount;
	
	/**
	* The constructor takes in an array of items and a integer indicating how many
	* items fit within a single page
	*/
	public PaginationHelper(List<I> collection, int itemsPerPage) {
	 
		this.items = collection;
		this.pageSize = itemsPerPage;
		this.pageCount = (int) Math.ceil(this.items.size() / (double) this.pageSize);
		
	}

	/**
	* returns the number of items within the entire collection
	*/
	public int itemCount() {
		return items.size();
	}

	/**
	* returns the number of pages
	*/
	public int pageCount() {
		return pageCount;
	}

	/**
	* returns the number of items on the current page. page_index is zero based.
	* this method should return -1 for pageIndex values that are out of range
	*/
	public int pageItemCount(int pageIndex) {
		
		if(pageIndex < 0 || pageIndex >= pageCount) {
			return -1;
		}
		
		long skipItems = (pageIndex > 0) ? pageIndex * pageSize : 0;
		return (int) items.stream().skip(skipItems).limit(pageSize).count();
	}
	
	/**
	* determines what page an item is on. Zero based indexes
	* this method should return -1 for itemIndex values that are out of range
	*/
	public int pageIndex(int itemIndex) {
		
		if(itemIndex < 0 || itemIndex >= items.size()) {
			return -1;
		}
		
		return itemIndex / pageSize;
	}
}
