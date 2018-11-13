package com.antra;

public class EmployeeVO {

	public String empId;
	public String name;
	public int sal;
	
	//emp vo objects up to date
	public EmployeeVO(String empId, String name, int sal) {
		super();
		this.empId = empId;//emp id
		this.name = name;
		this.sal = sal;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
}
