package com.model;

public class NewEmp 
{
  int eno;
  String ename;
  int esal;
public NewEmp() {
	super();
	// TODO Auto-generated constructor stub
}
public NewEmp(int eno, String ename, int esal) {
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
	return "NewEmp [eno=" + eno + ", ename=" + ename + ", esal=" + esal + "]";
}
  
}
