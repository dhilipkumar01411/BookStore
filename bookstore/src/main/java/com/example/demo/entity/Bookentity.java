package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bookentity {
public Bookentity() {
		super();
		// TODO Auto-generated constructor stub
	}
public Bookentity(int id, String bookname, String author, int ibsn, int price, int stock) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.author = author;
		this.ibsn = ibsn;
		this.price = price;
		this.stock = stock;
	}
@Id
private int id;
private String bookname;
private String author;
private int ibsn;
private int price;
private int stock;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getIbsn() {
	return ibsn;
}
public void setIbsn(int ibsn) {
	this.ibsn = ibsn;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}


}
