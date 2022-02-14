import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class mainclass {

	public static void main(String[] args) {

		
		 /// Session session = HibernateUtil.getSessionFactory().openSession();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        Person person= new Person();
        
        person.setName("Ajinkya");
        
        session.save(person);
        
        transaction.commit();
        
        session.close();           // Optional
        
        sessionFactory.close();   // Optional
    
	}

}
