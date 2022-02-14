package Constructor;

public class person 
{
	public int age;
	person(int age)
	{
	this.age=age;
	}
	
	public class copycons 
	{
	}

	
		public static void main(String[] args) 
		{
			
			person a= new person(10);
			person b= new person(50);
			
			person c=a;
			
			System.out.println(a.age+" "+b.age+" "+c.age);
			
			a.age=23;
			
			System.out.println(a.age+" "+b.age+" "+c.age);
		}
		
	}