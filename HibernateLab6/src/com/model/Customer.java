package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	
	@Id
	@Column(name = "cid")
	int cid;
	@Column(name = "fName",length = 15)
	String fName;
	@Column(name = "lName",length = 15)
	String lName;
	@Column(name = "anuSal",length = 15)
	float anuSal;
	@Column(name = "city",length = 15)
	String city;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String fName, String lName, float anuSal, String city) {
		super();
		this.cid = cid;
		this.fName = fName;
		this.lName = lName;
		this.anuSal = anuSal;
		this.city = city;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public float getAnuSal() {
		return anuSal;
	}
	public void setAnuSal(float anuSal) {
		this.anuSal = anuSal;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", fName=" + fName + ", lName=" + lName + ", anuSal=" + anuSal + ", city="
				+ city + "]";
	}
	
	
}
