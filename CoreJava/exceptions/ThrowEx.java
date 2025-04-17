package exceptions;

import java.io.FileNotFoundException;

public class ThrowEx {
	
	public static void vote(int age) throws FileNotFoundException {
		
		if(age<18) {
			throw new FileNotFoundException("Not eligible");
		}
		else {
			System.out.println("You r eligible to vote");
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException  {
		vote(2);
	}

}
