package day2;

public class twoClasses {
	
	float length, breadth;
	    
	void getdata(float a, float b)
	   
	{
		length = a;
	    breadth = b;
	   
	}

}

class Area

{  
	public static void main(String args[ ])
    
	{
		float area;
        
		twoClasses Rectangle = new twoClasses();
        
        Rectangle.getdata(5,5);
        
        area = Rectangle.length * Rectangle.breadth;
        
        System.out.println("Area : "+area);
    }
}