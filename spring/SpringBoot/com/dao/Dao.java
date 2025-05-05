package com.dao;

import com.entity.Employee;

public interface Dao {
	
	public String addEmp(Employee emp);
	
	public String updEmp(Employee emp);
	
	public String delEmp(int empId);
	
	public Employee getEmp(int empId);

}
