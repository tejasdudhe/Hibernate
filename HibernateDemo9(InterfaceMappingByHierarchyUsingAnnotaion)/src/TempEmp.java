import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Temp")
public class TempEmp extends Employee {
	@Column
	int workdays;
	@Column(length = 20)
	String cname;

	public TempEmp() {
		super();
	}

	public TempEmp(int eid, String ename, int esal, int wdays, String cname) {
		super(eid, ename, esal);
		this.workdays = wdays;
		this.cname = cname;
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
