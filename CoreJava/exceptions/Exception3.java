package exceptions;

class AgeNotValidException extends Exception{

	private int age;

	public AgeNotValidException() {

	}

}

public class Exception3 {
	
	public static void  validation(int age) throws AgeNotValidException {
		if(age<18) {
			throw new AgeNotValidException();
		}else {
			System.out.println("You are eligible to vote");
		}
	}
	
	public static void main(String[] args) throws AgeNotValidException {
		validation(2);
	}

}
