package com.codewithmosh.A_Behavioral.c_iterator.ex1;

public class Main {

	public static void main(String[] args) {
		
		UserManagement management = new UserManagement();
		
		management.addUser(new com.codewithmosh.A_Behavioral.c_iterator.ex1.User("a", 10));
		management.addUser(new com.codewithmosh.A_Behavioral.c_iterator.ex1.User("b", 20));
		management.addUser(new com.codewithmosh.A_Behavioral.c_iterator.ex1.User("c", 30));
		management.addUser(new com.codewithmosh.A_Behavioral.c_iterator.ex1.User("d", 40));
		
		MyIterator iterator = management.getMyIterator();
		
		while (iterator.hasNext()) {
			com.codewithmosh.A_Behavioral.c_iterator.ex1.User user = (com.codewithmosh.A_Behavioral.c_iterator.ex1.User)iterator.next();
			System.out.println(user.getId()+"\t"+user.getName());
		}
	}
}
