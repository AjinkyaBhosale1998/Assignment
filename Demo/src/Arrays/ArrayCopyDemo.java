package Arrays;

public class ArrayCopyDemo {

	public static void main(String[] args) 
	{
		
		char [] copyForm = {'a','b','c','d','e','f','g','h','i','j'};
		
		char [] copyTo = new char[5];
		
		System.arraycopy(copyForm, 2, copyTo, 0, 5);
		
		System.out.println(new String(copyTo));
	}

}
