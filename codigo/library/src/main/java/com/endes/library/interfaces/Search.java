package com.endes.library.interfaces;

import com.endes.library.BookItem;

public interface Search {
	   BookItem searchByTitle(String title);
	   BookItem searchByAuthor(String author);
}
		