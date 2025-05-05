package com.service;

import com.entity.Employee;

public interface Services {

	public String addEmp(Employee emp);

	public String updEmp(Employee emp);

	public String delEmp(int empId);

	public Employee getEmp(int empId);

}
