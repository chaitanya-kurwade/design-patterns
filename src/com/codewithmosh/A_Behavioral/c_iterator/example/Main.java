package com.codewithmosh.A_Behavioral.c_iterator.example;

public class Main {

	public static void main(String[] args) {
		
		UserManagement userManagement = new UserManagement();
		
		userManagement.addUser(new User("rajesh", "1"));
		userManagement.addUser(new User("pratik", "2"));
		userManagement.addUser(new User("mahesh", "3"));
		userManagement.addUser(new User("ankit", "14"));
		userManagement.addUser(new User("jeet", "13"));
		
		MyIterator iterator = userManagement.getIterator();
		while(iterator.hasNext()) {			
			User user = (User)iterator.next();
			System.out.println(user.getId()+"\t"+user.getName());
		}
	}
}
