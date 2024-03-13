package com.bhavani.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bhavani.model.Employee;

@Repository("empDAO")
public class EmployeeDaoImpl implements EmployeeDAO {

	List<Employee> list = null;
	// sql query
	private static final String GET_EMPS_BY_DESGS = "SELECT EMPNO,ENAME,JOB,SALARY,DEPTNO FROM EMPLOYEE WHERE JOB IN(?,?,?) ORDER BY JOB";
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		// TODO Auto-generated method stub
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(GET_EMPS_BY_DESGS);) {
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);

			list = new ArrayList<Employee>();
			try (ResultSet rs = ps.executeQuery()) {

				while (rs.next()) {
					Employee emp = new Employee();
					emp.setEmpno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSalary(rs.getFloat(4));
					emp.setDeptno(rs.getInt(5));
					list.add(emp);
				} // while
			} // try
		} // try
		catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
