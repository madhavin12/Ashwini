package hibernate1;
import org.hibernate.*;  
import org.hibernate.cfg.*;
import java.util.*;
public class StoreData {

	public static void main(String[] args) {
		 Configuration cfg=new Configuration();  
		    cfg.configure("hibernate.cfg.xml");
		      
		    
		    SessionFactory factory=cfg.buildSessionFactory();  
		      
		    //creating session object  
		    Session session=factory.openSession();  
		      
		    //creating transaction object  
		    Transaction t=session.beginTransaction();  
		          
		    Emp3 e1=new Emp3();  
		   e1.setId(115);  
		    e1.setname("sonoo");  
		    e1.setsal(2900);  
		      
		    session.persist(e1);
		    

		    
			
				Query qry = session.createQuery("select min(sal) from Emp3");
	      
			List l =qry.list();
			System.out.println("Total Number Of Records : "+l.size());
			Iterator it = l.iterator();

			while(it.hasNext())
			{
				Object o = (Object) it.next();
				System.out.println(" Name : "+e1.getId());
				System.out.println(" Name : "+e1.getname());
				System.out.println("lastname : "+e1.getsal());
				System.out.println("---------------------------");

			}		

			
		      
		    t.commit();
		    session.close();  
	}

}
