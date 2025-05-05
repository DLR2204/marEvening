package com.dao;

import org.springframework.stereotype.Repository;

import com.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DaoImplementation implements Dao{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public String addEmp(Employee emp) {
		
		em.persist(emp);   //insert
		
		return "Your data is inserted successfully";
	}

	@Override
	public String updEmp(Employee emp) {
		
		em.merge(emp);   //update
		
		return "Your data is updated successfully";
	}

	@Override
	public String delEmp(int empId) {
		
		Employee emp = em.find(Employee.class, empId);
		
		em.remove(emp); //delete
		
		return "Your data is removed successfully";
	}

	@Override
	public Employee getEmp(int empId) {
		
		return em.find(Employee.class, empId);  //select 
	}

}
