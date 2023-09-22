package com.codewithmosh.C_Creational.a_prototype.bookshop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShop {

	private String shopName;
	private List<Book> books = new ArrayList<>();
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}
	
	public void loadData() {
		for (int i = 1; i < 10; i++) {
			Book b = new Book();
			b.setBookName("Book "+i);
			b.setBookId(i);
			//((BookShop) books).
			getBooks().add(b);
		}
	}
	
	public BookShop cloneOrCopy() {
		
		BookShop newBookShop = new BookShop();
		newBookShop.setShopName(shopName);
		
		for (var b : getBooks()) {
			newBookShop.getBooks().add(b);
		}
		
		return newBookShop;
		
	}
	
}
