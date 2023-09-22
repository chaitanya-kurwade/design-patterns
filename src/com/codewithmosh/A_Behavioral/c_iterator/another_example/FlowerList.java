package com.codewithmosh.A_Behavioral.c_iterator.another_example;

import java.util.ArrayList;

public class FlowerList {

	private ArrayList<String> flowerList = new ArrayList<>();
	
	public void push(String flowers) {
		flowerList.add(flowers);
	}
	
	public String pop() {
		var lastIndex = flowerList.size()-1;
		var lastFlower = flowerList.get(lastIndex);
		flowerList.remove(lastFlower);
		return lastFlower;
	}
	
	public FlowerAnimalIterator createFlowerIterator() {
		return new FlowerIterator(this);
	}
	
	
	public class FlowerIterator implements FlowerAnimalIterator{

		private FlowerList flowerList;
		private int index;
		
		public FlowerIterator(FlowerList flowerList) {
			this.flowerList = flowerList;
		}

		@Override
		public boolean hasNext() {
			return (index < flowerList.flowerList.size());
		}

		//to fetch the current element
		@Override
		public String current() {
			return flowerList.flowerList.get(index);
		}
		
		@Override
		public Object next() {
			return index++;
		}		
	}
}
