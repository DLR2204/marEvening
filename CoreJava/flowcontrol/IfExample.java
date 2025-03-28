package flowcontrol;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {

		Scanner scan  = new Scanner(System.in);
		
		System.out.print("Enter your age:- ");
		
		byte age = scan.nextByte();
		
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}

		else {
			System.out.println("You are not eligible to vote");
		}
	}

}
