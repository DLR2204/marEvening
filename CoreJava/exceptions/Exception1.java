package exceptions;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the numerator:-");
		
		int num = scan.nextInt();
		
		System.out.print("Enter the denominator:- ");

		int den = scan.nextInt();
		
		try {
		int result = num /den;
		
		System.out.println("The result is :- "+result);
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please don't enter zero as the denominator");
		}
		finally {
			System.out.println("Iam from the finally block!!!!");
		}
		
		System.out.println("The remaining 10,000 lines");
		
	}

}
