package com.codewithmosh.A_Behavioral.c_iterator.another_example1;

import java.util.ArrayList;
import java.util.List;


public class ListFlower  {

	
	private List<String> list = new ArrayList<>();

	public void push(String flower) {
		list.add(flower);
	}
	
	public String pop() {
		var lastIndex = list.size()-1;
		var lastItem = list.get(lastIndex);
		list.remove(lastItem);
		return lastItem;
	}
	
	public AnimalFlowerIterator createFlowerIterator() {
		return new ListFlowerIterator(this);
	}

	private class ListFlowerIterator implements AnimalFlowerIterator{

		private ListFlower flower;
		private int index;
		
		public ListFlowerIterator(ListFlower flower) {
			this.flower = flower;
		}
		
		@Override
		public Object next() {
			
			return (index++);
		}

		@Override
		public boolean hasNext() {
			
			return (index < flower.list.size());
		}

		@Override
		public String current() {
			return flower.list.get(index);
		}
		
	}
	
}
