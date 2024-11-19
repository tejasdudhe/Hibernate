import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Pemp")
public class PerEmp extends Employee {
	@Column(length = 20)
	String desig;
	@Column(length = 20)
	String dname;

	public PerEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PerEmp(int eid, String ename, int esal, String design, String dname) {
		super(eid, ename, esal);
		this.desig = design;
		this.dname = dname;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "PerEmp [desig=" + desig + ", dname=" + dname + "]";
	}

}
