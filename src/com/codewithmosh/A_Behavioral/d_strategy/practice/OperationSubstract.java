package com.codewithmosh.A_Behavioral.d_strategy.practice;

public class OperationSubstract implements CalculationStrategy{
	
	public void doCalculate(int num1, int num2) {
		System.out.print("Substraction of "+num1+" and "+num2+" : ");
		System.out.print(num1-num2);
		System.out.println();
	}
}
