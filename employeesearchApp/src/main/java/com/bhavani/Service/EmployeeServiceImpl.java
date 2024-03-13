package com.bhavani.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavani.DAO.EmployeeDAO;
import com.bhavani.model.Employee;


@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeeDAO;
	@Override
	public List<Employee> fetchEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception {
		// TODO Auto-generated method stub
		desg1=desg1.toUpperCase();
		desg2=desg2.toUpperCase();
		desg3=desg3.toUpperCase();
		
		List<Employee> list = employeeDAO.getEmployeesByDesgs(desg1, desg2, desg3);
		return list;
	}

}
