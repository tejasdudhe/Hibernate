import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp103")
public class Employee 
{
  @Id	
  int eid;
  @Column(name="ename",length = 15)
  String ename;
  @Column(name="esal",length = 7)
  int esal;
  @Embedded
  Address addr;// component class ref
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int eid, String ename, int esal, Address addr) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esal = esal;
	this.addr = addr;
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
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	this.addr = addr;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", addr=" + addr + "]";
}
  
}
