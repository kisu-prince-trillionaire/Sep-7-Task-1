package com.record.book;

import java.util.Date;

public class Books {
	int bId;
	String bookName;
	double price;
	Date dateOfIssue;
	
	public Books() {
		System.out.println("Default");
	}
	
	public Books(int bId, String bookName, double price, Date dateOfIssue) {
		this.bId = bId;
		this.bookName = bookName;
		this.price = price;
		this.dateOfIssue = dateOfIssue;
	}
	
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDate() {
		return dateOfIssue;
	}
	public void setDate(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	
	public void display() {
		System.out.println(" | Book Id = " + bId + " | Book Name = " + bookName + " | Book Price = " + price + " | Date of Issue = " + dateOfIssue + " |" );

	}
	
}
