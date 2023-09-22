package com.codewithmosh.A_Behavioral.f_command.example1;

import com.codewithmosh.A_Behavioral.f_command.example1.fx.Command;

public class AddCustomerCommand implements Command{
	private CustomerService service;
	
	public AddCustomerCommand(CustomerService service) {
		this.service = service;
	}
	
	@Override
	public void execute() {
		service.addCustomer();
	}
}
