import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Test 
{
  public static void main(String[] args) 
  {
	  Configuration c= new Configuration();
      SessionFactory sf=c.configure().buildSessionFactory();
      Session s=sf.openSession();
   	  Transaction t=s.beginTransaction();
      
   	  Employee e1= new Employee(1,"Amit",15000);
   	  PerEmp e2= new PerEmp(2,"Sumit",12500,"Mgr","AC");
   	  TempEmp e3= new TempEmp(3,"Ajit",25000,5,"MrSharma");
      
      s.save(e1);
      s.save(e2);
      s.save(e3);
      
      t.commit();
      s.close();
      sf.close();
  }
}
