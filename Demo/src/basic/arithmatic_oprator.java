package basic;

public class arithmatic_oprator 
{
	public static void main(String[] args) 
	{

		 int x=40;
	     int y=60;
	     int z=100;
	     int rs=0;
	            
	     		rs = x + y;
	            System.out.println("The addition of (x+y):"+ rs);
	            
	            rs  = y - x;
	            System.out.println("The subtraction of (y-x):"+ rs);
	     
	            rs = x * y;
	            System.out.println("The multiplication of (x*y):"+ rs);
	     
	            rs = y / x;
	            System.out.println("The division of (y/x):"+ rs);
	     
	            rs = x + (y * (z/x));
	            System.out.println("The result is now :"+ rs);
	 
	}
}