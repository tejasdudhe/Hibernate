import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="hib_employee")
public class Employee {
	@Id
	@Column(name="eid")
	private long employeId;
	@Column(name="fname",length=15)
	private String firstname;
	@Column(name="lname",length=15)
	private String lastname;
	@Column(name="bdate")
	private Date birthDate;
	@Column(name="cellphone",length=20)
	private String cellphone;

	@ManyToOne
	@JoinColumn(name="dept_id")
	private Department department;
	
	public Employee(long employeId, String firstname, String lastname, Date birthDate, String cellphone) {
		super();
		this.employeId = employeId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDate = birthDate;
		this.cellphone = cellphone;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getEmployeId() {
		return employeId;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public String getCellphone() {
		return cellphone;
	}

	@Override
	public String toString() {
		return "Employee [employeId=" + employeId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", birthDate=" + birthDate + ", cellphone=" + cellphone + "]";
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}


}