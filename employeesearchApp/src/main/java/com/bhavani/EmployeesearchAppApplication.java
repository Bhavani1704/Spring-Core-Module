package com.bhavani;

import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bhavani.controller.EmployeeController;
import com.bhavani.model.Employee;

@SpringBootApplication
public class EmployeesearchAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(EmployeesearchAppApplication.class, args);
		
		EmployeeController controller =ctx.getBean("controller",EmployeeController.class);
		try {
			List<Employee> list = controller.showEmployeeByDesgs("ibm", "doc", "phar");
			list.forEach(emp->{System.out.println(emp);
			
		});
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("EmployeesearchAppApplication.main()"+e.getMessage());
		}
	}

}
