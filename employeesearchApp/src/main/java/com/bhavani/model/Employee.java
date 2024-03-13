package com.bhavani.model;

import lombok.Data;

@Data // gives setters,getters,toString,equals but i added manually here
public class Employee {
	
	private Integer empno;
	private String ename;
	private String job;
	private Float salary;
	private Integer deptno;
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job + ", salary=" + salary + ", deptno="
				+ deptno + "]";
	}
	
}
