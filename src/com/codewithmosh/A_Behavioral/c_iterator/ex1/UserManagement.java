package com.codewithmosh.A_Behavioral.c_iterator.ex1;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {

	private List<User> users = new ArrayList<>();
	
	public void addUser(User user) {
		users.add(user);
	}
	
	public User getUser(int index) {
		return users.get(index);
	}
	
	public MyIterator getMyIterator() {
		return new MyIteratorImpl(users);
	}
}
