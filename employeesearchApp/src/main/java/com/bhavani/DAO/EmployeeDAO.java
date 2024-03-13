package com.bhavani.DAO;

import java.util.List;

import com.bhavani.model.Employee;

public interface EmployeeDAO {
	
	public List<Employee> getEmployeesByDesgs(String desg1,String desg2,String desg3) throws Exception;
	
	

}
