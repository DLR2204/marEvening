package exceptions;

public class Exception2 {
	
	public static void main(String[] args) {
		
		try {
		
		int arr[] = new int[5];
		
		arr[100] = 20/0;
		
		System.out.println(arr[3]+"  No Error");
		}
		
		catch(ArithmeticException e) {
			System.out.println("17.Don't enter zero as the denominator");
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("20.Index is out of range");
		}
		catch(Exception g) {
			System.out.println("23." +g);
		}
		
	}

}
