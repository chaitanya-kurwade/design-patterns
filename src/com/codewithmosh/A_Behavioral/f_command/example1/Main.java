package com.codewithmosh.A_Behavioral.f_command.example1;

public class Main {

	public static void main(String[] args) {
//		var service = new CustomerService();
//		var command = new AddCustomerCommand(service);
//		var button = new Button(command);
//		button.click();
		
		var composite = new CompositeCommand();
		composite.add(new ResizeCommand());
		composite.add(new BlackAndWhiteCommand());
		
		composite.add(new AddCustomerCommand(new CustomerService()));
//		composite.execute();
		composite.execute();
	}
}
