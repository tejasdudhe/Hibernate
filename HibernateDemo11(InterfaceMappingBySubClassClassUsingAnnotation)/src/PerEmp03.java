import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "child1_pemp")
@PrimaryKeyJoinColumn(name="p_id")
public class PerEmp03 extends Employee
{
  String desig;
  String dname;
  public PerEmp03() 
  {
	super();
	// TODO Auto-generated constructor stub
  }
  public PerEmp03(int eid, String ename, int esal,String design,String dname)
  {
   super(eid, ename, esal);
   this.desig=design;
   this.dname=dname;
  }
  public String getDesig() 
  {
	return desig;
  }
  public void setDesig(String desig) 
  {
	this.desig = desig;
  }
  public String getDname() 
  {
	return dname;
  }
  public void setDname(String dname) 
  {
	this.dname = dname;
  }
@Override
public String toString() {
	return "PerEmp [desig=" + desig + ", dname=" + dname + "]";
}
  
	

}
