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
		          
		    Emp e1=new Emp();  
		   e1.setId(115);  
		    e1.setFirstname("sonoo");  
		    e1.setLastname("banu"); 
		    e1.setAddress("bangalore");
		      
		    session.persist(e1);
		    

		    
			
				Query qry = session.createQuery("select id from Emp");
	      
			List l =qry.list();
			System.out.println("Total Number Of Records : "+l.size());
			Iterator it = l.iterator();

			while(it.hasNext())
			{
				Object o = (Object) it.next();
				System.out.println(" id : "+e1.getId());
				System.out.println(" Name : "+e1.getFirstname());
				System.out.println("lastname : "+e1.getLastname());
				System.out.println("Address:  " +e1.getAddress());
				System.out.println("---------------------------");

			}		

			
		      
		    t.commit();
		    session.close();  
	}

}
