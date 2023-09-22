package com.codewithmosh.A_Behavioral.c_iterator.anotherex1;

public class IIteratorPatternDemo {
	
	   public static void main(String[] args) {
	      NameRepo namesRepository = new NameRepo();

	      for(IIterator iter = namesRepository.getIIterator();
	    		  iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	   }
	}
