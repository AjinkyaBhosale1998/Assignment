package object;

public class Cartest {

	public static void main(String[] args) 
	{
		
		//create the object of class with new keyword
		
		Car c = new Car();
				
		
				c.licensePlate="DL 83478";
				c.speed=90.0;
				c.maxspeed=160.0;
				
				
				System.out.println("Lic No. "+c.licensePlate);
				System.out.println("Speed "+c.speed);
				System.out.println("Max Speed "+c.maxspeed);
			}
	}