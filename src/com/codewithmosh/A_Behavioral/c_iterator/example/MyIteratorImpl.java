package com.codewithmosh.A_Behavioral.c_iterator.example;

import java.util.ArrayList;
import java.util.List;

public class MyIteratorImpl implements MyIterator {

	private List<User> list;
	private int length;
	private int position;
	
	public MyIteratorImpl(ArrayList<User> list) {
		this.list=list;	
		this.length = list.size();
	}

	@Override
	public boolean hasNext() {
		
		if(position>=length) {
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public Object next() {
		User user = list.get(position);
		position+=1;
		return user;
	}
	
}
