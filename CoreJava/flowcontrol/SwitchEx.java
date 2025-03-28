package flowcontrol;

import java.util.Scanner;

public class SwitchEx {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your obtained marks:- ");
		
		float om = scan.nextFloat();
		
		System.out.print("Enter your max marks:- ");
		
		float mm = scan.nextFloat();
		
		float percentage = (om/mm)*100;
		
		System.out.println("Your percentage is :- "+percentage);
		
		int gpa = (int)percentage/10 ;
		
		System.out.println("Your gpa is:- "+gpa);
		
		System.out.print("Your grade is:- ");
		
		
		switch(gpa) {
		
		case 10:{
			
			System.out.println("Grade-Ex");
			break;
		}
		
		case 9:{
			System.out.println("Grade-A");
			break;
			
		}
	
		
		case 8:{
			System.out.println("Grade-B");
			break;
			
		}
		case 7:{
			System.out.println("Grade-C");
			break;
			
		}
		
		case 6:{
			System.out.println("Grade-D");
			break;
			
		}
		
		case 5:{
			System.out.println("Grade-E");
			break;
			
		}
		default:{
			System.out.println("Fail");
			break;
			
		}
		
		
		}
		
		
	}

}
