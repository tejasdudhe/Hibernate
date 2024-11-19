import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="hib_dept")
public class Department {
@Id
@GeneratedValue
@Column(name="dept_id")

private long Departmentid;

@Column(name="dept_name",length=10)
private String departmentName;

@OneToMany(mappedBy="department",cascade=CascadeType.ALL)
private Set<Employee> employees;

public Department() {
	super();
	// TODO Auto-generated constructor stub
}

public Department(long departmentid, String departmentName) {
	super();
	Departmentid = departmentid;
	this.departmentName = departmentName;
}

public long getDepartmentid() {
	return Departmentid;
}

public String getDepartmentName() {
	return departmentName;
}

public void setDepartmentid(long departmentid) {
	Departmentid = departmentid;
}

public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}

@Override
public String toString() {
	return "Department [Departmentid=" + Departmentid + ", departmentName=" + departmentName + "]";
}


}
