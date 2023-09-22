package com.codewithmosh.A_Behavioral.c_iterator.ex1;

import java.util.ArrayList;
import java.util.List;

import com.codewithmosh.A_Behavioral.c_iterator.example.User;

public class MyIteratorImpl implements MyIterator{

	
	private List<com.codewithmosh.A_Behavioral.c_iterator.ex1.User> users = new ArrayList<>();
	private int length;
	private int position;
	
	public MyIteratorImpl(List<com.codewithmosh.A_Behavioral.c_iterator.ex1.User> users) {
		this.users = users;
		this.length = users.size();
	}
	
	
	@Override
	public boolean hasNext() {
		if (position >= length) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public Object next() {
		com.codewithmosh.A_Behavioral.c_iterator.ex1.User user = users.get(position);
		position+=1;
		return user;
	}

}
