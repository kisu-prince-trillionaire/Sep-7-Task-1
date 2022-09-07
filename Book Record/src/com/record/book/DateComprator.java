package com.record.book;

import java.util.Comparator;

public class DateComprator implements Comparator<Books> {
	public int compare(Books b1, Books b2) {
		if((b1.getDate()).compareTo(b2.getDate()) > 0)
			 return 1;
		 else if((b1.getDate()).compareTo(b2.getDate()) < 0)
			 return -1;
		 else
			 return 0;
	}

}
