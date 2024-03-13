package com.bhavani.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bhavani.Service.EmployeeService;
import com.bhavani.model.Employee;

@Controller("controller")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	//fetch employees through their desgination
	public List<Employee> showEmployeeByDesgs(String desg1,String desg2,String desg3) throws Exception
	{
		List<Employee> list = empService.fetchEmployeeByDesgs(desg1, desg2, desg3);
		return list;
		
	}
}
