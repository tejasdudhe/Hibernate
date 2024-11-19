public class TempEmp extends Employee
{
  int workdays;
  String cname;
public TempEmp() {
	super();
}
public TempEmp(int eid, String ename, int esal,int wdays,String cname)
{
	super(eid, ename, esal);
	this.workdays=wdays;
	this.cname=cname;
}
public int getWorkdays() {
	return workdays;
}
public void setWorkdays(int workdays) {
	this.workdays = workdays;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
@Override
public String toString() {
	return "TempEmp [workdays=" + workdays + ", cname=" + cname + "]";
}
  
}
