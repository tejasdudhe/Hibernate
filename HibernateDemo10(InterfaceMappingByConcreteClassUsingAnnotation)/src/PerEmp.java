import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "child1_pemp")
@AttributeOverrides({
	@AttributeOverride(column = @Column(name = "name_p"),name="name"),
	@AttributeOverride(column = @Column(name = "salary_p"),name="salary")
})
public class PerEmp extends Employee
{
	@Column(length = 20)
	String desig;
	@Column(length = 20)
	String dname;
  public PerEmp() 
  {
	super();
	// TODO Auto-generated constructor stub
  }
  public PerEmp(int eid, String ename, int esal,String design,String dname)
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
