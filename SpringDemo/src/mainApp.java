import org.springframework.context.support.ClassPathXmlApplicationContext;



public class mainApp
{
public static void main(String[] args)
{

	ClassPathXmlApplicationContext classPathXmlApplicationContext =
new ClassPathXmlApplicationContext("SpringTest.xml");
Book book_bean = (Book) classPathXmlApplicationContext.getBean("book_bean");
Book book_bean1 = (Book) classPathXmlApplicationContext.getBean("book_bean_const");
//Book book_bean2 = (Book) classPathXmlApplicationContext.getBean("book_bean_mixed");
Author book_bean3 = (Author) classPathXmlApplicationContext.getBean("author_bean");
Book book_bean4 = (Book) classPathXmlApplicationContext.getBean("book_bean");



System.out.println(book_bean);
System.out.println(book_bean1);
//System.out.println(book_bean2);
System.out.println(book_bean3);
System.out.println(book_bean4);
System.out.println(book_bean.getIsbn()+" "+book_bean.getPrice()+" "+book_bean.getTitle());



}



}