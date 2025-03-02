import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "hib_empdetails")
public class EmployeeDetails 
{
	@Id
	@Column(name = "eid")
	private long employeeId;
	@Column(name = "street",length = 15)
	private String street;
	@Column(name = "city",length = 15)
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "country",length = 20)
	private String country;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Employee employee;

	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDetails(long employeeId, String street, String city, String state, String country) {
		super();
		this.employeeId = employeeId;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		
	}
	
	
	
	
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", street=" + street + ", city=" + city + ", state="
				+ state + ", country=" + country + ", employee=" + employee + "]";
	}
}
