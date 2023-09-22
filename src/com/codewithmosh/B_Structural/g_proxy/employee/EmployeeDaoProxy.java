package com.codewithmosh.B_Structural.g_proxy.employee;

public class EmployeeDaoProxy implements EmployeeDao{

	EmployeeDao dao;
	public EmployeeDaoProxy() {
		dao = new EmployeeDaoImpl();
	}
	
	@Override
	public void create(String client, Employee obj) throws Exception {
		if (client.equals("ADMIN")) {
			dao.create(client, obj);
			return;
		}
		throw new Exception("Access Denied");
	}
	
	
}
