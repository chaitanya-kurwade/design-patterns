package com.codewithmosh.A_Behavioral.c_iterator.practice;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistoryList {

	private List<String> browsingHistory = new ArrayList<>();
	
//	private String history;
	
	public void browse(String history) {
		browsingHistory.add(history);
	}
	
	public String deleteBrowsingHistory() {
		var latestSearchIndex = browsingHistory.size()-1;
		var latestSearch = browsingHistory.get(latestSearchIndex);
		browsingHistory.remove(latestSearchIndex);
		return latestSearch;
	}
	
	
	
}
