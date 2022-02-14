package day2;

public class callByValue 
{
    void meth(int i,int j)
    {
 
    	i=i*2;
        j=j/2;

    }
}

class cbv
{   
	public static void main (String args [ ])
    {
	
		callByValue t=new callByValue();
       
	int a=4,b=7;
    
	System.out.println ("Before calling a="+a+"b="+b);
    
	t.meth(a,b);
    
	System.out.println ("After calling a="+a+"b="+b);
    
    }
}