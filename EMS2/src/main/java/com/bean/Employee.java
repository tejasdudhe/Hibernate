package com.bean;

public class Employee 
{
  int eid;
  String ename;
  int esal;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int eid, String ename, int esal) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esal = esal;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
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
	return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
}
  
}
