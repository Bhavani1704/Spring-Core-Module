package com.bhavani.Service;

import java.util.List;
import com.bhavani.model.Employee;

public interface EmployeeService {
	public List<Employee> fetchEmployeeByDesgs(String desg1,String desg2,String desg3)throws Exception;
}
