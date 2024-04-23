package com.endes.library.interfaces;

import com.endes.library.BookItem;

public interface Manage {
	  void createBookItem(BookItem bookItem);
	  void updateBookItem(BookItem bookItem);
	  void deleteBookItem(String ISBN);
	  BookItem getBookItem(String ISBN);
}
