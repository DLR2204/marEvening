package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Dao;
import com.entity.Employee;

@Service
public class ServiceImplementation implements Services{

	@Autowired
	Dao dao;
	
	@Override
	public String addEmp(Employee emp) {
		
		return dao.addEmp(emp);
	}

	@Override
	public String updEmp(Employee emp) {
		
		return dao.updEmp(emp);
	}

	@Override
	public String delEmp(int empId) {
		
		return dao.delEmp(empId);
	}

	@Override
	public Employee getEmp(int empId) {
		
		return dao.getEmp(empId);
	}

}
