package com.codewithmosh.A_Behavioral.d_strategy.practice;

public class Main {

	public static void main(String[] args) {

		Context context = new Context(new OperationAdd());
		context.doOperation(23, 34);
		
		Context context2 = new Context(new OperationMultiply());
		context2.doOperation(23, 34);
		
		Context context3 = new Context(new OperationSubstract());
		context3.doOperation(23, 34);
	}
	
}
