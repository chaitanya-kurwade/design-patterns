package com.codewithmosh.A_Behavioral.d_strategy.practice;

public class OperationAdd implements CalculationStrategy{

	@Override
	public void doCalculate(int num1, int num2) {	
		System.out.print("Addition of "+num1+" and "+num2+" : ");
		System.out.print(num1+num2);
		System.out.println();
	}

}
