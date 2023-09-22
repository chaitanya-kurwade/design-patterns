package com.codewithmosh.A_Behavioral.c_iterator;

public class BrowseHistory {

	
	// private List<String> urls = new ArrayList<>();
	
	private String[] urls = new String[12];
	private int count;
	
	public void push(String url) {
//		urls.add(url);
		urls[count++] = url;
	}
	
	public String pop() {
//		var lastIndex = urls.size()-1;
//		var lastUrl = urls.get(lastIndex);
//		urls.remove(lastUrl);
//		return lastUrl;
		return urls[--count];
	}
	
	public Iterator createIterator() {
		//return new ListIterator(this);
		return new ArrayIterator(this);
	}
	
//	public class ListIterator implements Iterator{
//
//		private BrowseHistory browseHistory;
//		
//		private int index;
//		
//		public ListIterator(BrowseHistory browseHistory) {
//			this.browseHistory = browseHistory;
//		}
//		
//		@Override
//		public boolean hasNext() {
//			// TODO Auto-generated method stub
//			return (index < browseHistory.urls.size());
//		}
//
//		@Override
//		public String current() {
//			// TODO Auto-generated method stub
//			return browseHistory.urls.get(index);
//		}
//
//		@Override
//		public void next() {
//			// TODO Auto-generated method stub
//			index++;
//		}
		
	
	public class  ArrayIterator implements Iterator {

		private BrowseHistory history;
		private int index;
		
		public ArrayIterator(BrowseHistory history) {
			// TODO Auto-generated constructor stub
			this.history = history;
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (index < history.count);
		}

		@Override
		public String current() {
			// TODO Auto-generated method stub
			return history.urls[index];
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			index++;
		}
		
	}
	
	
	
	
}
