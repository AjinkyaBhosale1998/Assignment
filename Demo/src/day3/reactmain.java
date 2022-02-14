package day3;

public class reactmain {

	public static void main(String[] args) {

		Reactangle r = new Reactangle();
		
		  r.show(5,6);
          int area = r.calculate();
          System.out.println("The area of a Rectangle is  :  " + area);
	}

}
