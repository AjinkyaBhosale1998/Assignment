import org.springframework.context.support.ClassPathXmlApplicationContext;

public class initMethodTest {
	
    public static void main(String[] args) {
    
    	ClassPathXmlApplicationContext classPathXmlApplicationContext =
        
    			new ClassPathXmlApplicationContext("SpringTest.xml");
       
    	Publisher pub = (Publisher) classPathXmlApplicationContext.getBean("pub");
        
    	System.out.println(pub);
    }
}