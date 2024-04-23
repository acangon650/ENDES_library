package com.endes.library;

import java.util.List;

public class Patron {
	private String name;
	private String address;
	
	public String SearchByTittle(String title) {
		Catalog cat = null; 
		cat.searchByTitle(title);
		return cat.toString();
	}
	
	public String searchByAuthor(String author) {
		Catalog cat = null; 
		cat.searchByAuthor(author);
		return cat.toString();
	}
}
