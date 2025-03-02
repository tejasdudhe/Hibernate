import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {

	public static void main(String[] args) {

		Configuration con = new Configuration();
		SessionFactory sf = con.configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		
		 Department d1 = new Department();
		 d1.setDepartmentName("Sales");
		 s.save(d1);
		 
		 Department d2 = new Department();
		 d1.setDepartmentName("Marketing");
		 s.save(d2);
		 
		 Employee emp1 = new Employee(1291,"John","Joy",null, "567");
		 Employee emp2 = new Employee(2341,"Sam","Almy",null, "2345");
		 emp1.setDepartment(d1);
		 emp2.setDepartment(d1);
		 
		 Employee emp3 = new Employee(6661,"Rob","Dex",null, "567");
		 Employee emp4 = new Employee(7771,"Sameer","Al",null, "2345");
		 emp3.setDepartment(d2);
		 emp4.setDepartment(d2);
		 
		 s.save(emp3);
		 s.save(emp4);
		 
		  t.commit();
	}

}
