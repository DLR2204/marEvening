package exceptions;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the numerator:-");
		
		int num = scan.nextInt();
		
		System.out.print("Enter the denominator:- ");

		int den = scan.nextInt();
		
		int result = num /den;
		
		System.out.println("The result is :- "+result);
		
		System.out.println("The remaning 10,000 lines");
	}

}
