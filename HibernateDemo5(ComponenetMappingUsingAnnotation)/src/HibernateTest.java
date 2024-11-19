import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTest 
{
 public static void main(String[] args) 
 {
	 Configuration c= new Configuration();
	 SessionFactory sf=c.configure().buildSessionFactory();
	 Session s=sf.openSession();
	 Transaction t=s.beginTransaction();
	 
	 Employee e1=new Employee(101,"Amit",12000,new Address(1,"Seed1","Karve Rd" ,"Pune"));
	 Employee e2=new Employee(102,"Sumit",14000,new Address(2,"Seed2","Karve Rd" ,"Pune"));
	 s.save(e1);
     s.save(e2);
	 
	 t.commit();
	 s.close();
	 sf.close();


 }
}
