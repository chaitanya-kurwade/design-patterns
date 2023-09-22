package com.codewithmosh.A_Behavioral.d_strategy.practice;

public class Context {
	private CalculationStrategy calculationStrategy;
	
	public Context(CalculationStrategy calculationStrategy) {
		this.calculationStrategy = calculationStrategy;
	}
	
	public void doOperation(int num1, int num2) {
		calculationStrategy.doCalculate(num1, num2);
	}
	
}
