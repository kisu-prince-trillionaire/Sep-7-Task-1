package com.record.book;

import java.util.Comparator;

public class BookNameComprator implements Comparator<Books> {
	public int compare(Books b1, Books b2)  {
		return b1.getBookName().compareTo(b2.getBookName());
	}

}
