package hibmapping;


import org.hibernate.*;  
import org.hibernate.cfg.*;
public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();  
	    cfg.configure("hib.cfg.xml");
	      
	    SessionFactory factory=cfg.buildSessionFactory();   
	    Session session=factory.openSession();  
	    
	    Transaction t=session.beginTransaction();    
	        
	    Emp2 e1=new Emp2();    
	    e1.setname("Gaurav Chawla");    
	        
	    RegEmp e2=new  RegEmp();    
	    e2.setname("Vivek Kumar");    
	    e2.setsalary(50000);    
	    e2.setbonus(5);    
	        
	    Conemp e3=new Conemp();    
	    e3.setname("Arjun Kumar");    
	    e3.pay_per_hour(1000);    
	    e3.setwhours("15 hours");    
	        
	    session.persist(e1);    
	    session.persist(e2);    
	    session.persist(e3);    
	        
	    t.commit();    
	    session.close();    
	    System.out.println("success");    
	}    
	  
	}


