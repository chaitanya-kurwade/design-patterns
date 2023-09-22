package com.codewithmosh.B_Structural.g_proxy.employee;

public class Main {

	public static void main(String[] args) {
		try {
			EmployeeDao dao = new EmployeeDaoProxy();
//			dao.create("ADMIN", new Employee());
			dao.create("USER", new Employee());
			System.out.println("Operation successful");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
