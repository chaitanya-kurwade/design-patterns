package com.codewithmosh.A_Behavioral.c_iterator;

//some class implements the current method with --> Iterator<String>
// public interface Iterator<T> ---in generic interface
public interface Iterator {
	boolean hasNext();
	String current();
	void next();
}
