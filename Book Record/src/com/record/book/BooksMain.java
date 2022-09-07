package com.record.book;
import java.util.Arrays;
import java.util.Date;

public class BooksMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books b[];
		b = new Books[4];
		
		b[0] = new Books(1,"Ramayan",1000,new Date(2022-10-05));
		b[1] = new Books(2,"Mahabharat",500,new Date(2020-9-10));
		b[2] = new Books(3,"Udaan",100,new Date(2022-8-11));
		b[3] = new Books(4,"Wings",150,new Date(2015-7-12));
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("The Book Details are : ");
		for(Books bk: b) {
			bk.display();
		}
		System.out.println("-----------------------------------------------------------");
		Arrays.sort(b, new BookNameComprator());
		for(Books bk: b) {
			if(bk.getBookName().equalsIgnoreCase("Ram")) {
				bk.display();
			}
		}
		System.out.println("-----------------------------------------------------------");

		
		Arrays.sort(b, new BookNameComprator());
		System.out.println("-----------------------------------------------------------");
		System.out.println("After Sorting ");
		for(Books bk: b) {
			bk.display();
		}
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Sorting by book name ");
		Arrays.sort(b, new BookNameComprator());
		for(Books bk1: b) {
			bk1.display();
		}
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Sorting by Price ");
		Arrays.sort(b, new PriceComprator());
		for(Books bk1: b) {
			bk1.display();
		}
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Sorting by Date of Publishing ");
		Arrays.sort(b, new DateComprator());
		for(Books bk1: b) {
			bk1.display();
		}
		System.out.println("-----------------------------------------------------------");

	}

}
