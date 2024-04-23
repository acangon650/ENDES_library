package com.endes.library;

import java.util.HashSet;
import java.util.List;

import com.endes.library.interfaces.Manage;
import com.endes.library.interfaces.Search;

public class Catalog implements Search,Manage{
	
	private List<BookItem> BookList=(List<BookItem>) new HashSet();
	
	@Override
	public void createBookItem(BookItem bookItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBookItem(BookItem bookItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBookItem(String ISBN) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BookItem getBookItem(String ISBN) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookItem searchByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookItem searchByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

}
