package com.record.book;

import java.util.Comparator;

public class PriceComprator implements Comparator<Books> {
	 public int compare(Books b1, Books b2) {
		 if(b1.getPrice() > b2.getPrice())
			 return 1;
		 else if(b1.getPrice() < b2.getPrice())
			 return -1;
		 else
			 return 0;
	 }
	 

}
