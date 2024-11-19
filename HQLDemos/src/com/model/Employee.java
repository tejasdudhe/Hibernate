package com.model;

public class Employee
{
	int eno;
	String ename;
	int esal;
	public Employee() 
	{
		super();
	}
	public Employee(int eno, String ename, int esal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "NewEmployee [eno=" + eno + ", ename=" + ename + ", esal="
				+ esal + "]";
	}
	
}
