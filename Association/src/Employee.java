import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hib_emp")
public class Employee 
{
	@Id
	@Column(name = "eid")
	private long employeeId;
	



	@Column(name = "fName",length = 15)
	private String firstName;
	@Column(name = "lName",length = 15)
	private String lastName;
	@Column(name = "bDate")
	private String birthDate;
	@Column(name = "cPhone",length = 20)
	private String cellPhone;
	
	@OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
	private EmployeeDetails employeedetails;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee(long employeeId, String firstName, String lastName, String birthDate, String cellPhone) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.cellPhone = cellPhone;
	}



	public long getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}



	public String getCellPhone() {
		return cellPhone;
	}



	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public EmployeeDetails getEmployeedetails() {
		return employeedetails;
	}



	public void setEmployeedetails(EmployeeDetails employeedetails) {
		this.employeedetails = employeedetails;
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", birthDate=" + birthDate + ", cellPhone=" + cellPhone + ", employeedetails=" + employeedetails
				+ "]";
	}

	
	
	
	
	
}
