package com.codewithmosh.A_Behavioral.c_iterator.example;

import java.util.ArrayList;

public class UserManagement {

	private ArrayList<User> userList = new ArrayList<>();
	
	public void addUser(User user) {
		userList.add(user);
	}
	
	public User getUser(int index) {
		return userList.get(index);
	}
	
	public MyIterator getIterator() {
		return new MyIteratorImpl(userList);
	}
	
}
