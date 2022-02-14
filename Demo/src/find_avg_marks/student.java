package find_avg_marks;

import java.util.Scanner;

public class student {
	
	private int i, n , avg, total;
	private int a[]=new int [10];
	
	public String s= new String();
	
	public Scanner scn= new Scanner(System.in);
	
	public void read()
	
    {
		System.out.println("enter student name");           
        s=scn.nextLine();       
        System.out.println("Enter student ID:");
        n=scn.nextInt();
        System.out.println("Enter 6 subject marks:");
             for(i=0;i<6;i++)
             a[i]=scn.nextInt();
    }
        
	public void calculate()
        {    
		for(i=0;i<6;i++)
                      
		total+=a[i];
                            
		avg=(total/6);
        }
	

}
