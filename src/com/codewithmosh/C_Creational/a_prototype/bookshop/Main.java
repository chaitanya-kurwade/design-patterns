package com.codewithmosh.C_Creational.a_prototype.bookshop;

public class Main {

	public static void main(String[] args) {
		var bookShop = new BookShop();
		bookShop.setShopName("Novelty1");
		
		bookShop.loadData();
		
		
		
		var bookShop2 = bookShop.cloneOrCopy();
		bookShop2.setShopName("Novelty2");
//		bookShop2.loadData();
		
		bookShop.getBooks().remove(0);
		
		System.out.println(bookShop);
		System.out.println(bookShop2);
	}
}
