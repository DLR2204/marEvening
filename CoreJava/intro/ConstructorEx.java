package intro;

public class ConstructorEx {
	
	public ConstructorEx() {
		
		System.out.println("7.Iam from the default constructor");
	}
	
	
	public ConstructorEx(String name) {
		System.out.println("12.My name is:- "+name);
	}
	
	public static void main(String[] args) {
		
		ConstructorEx obj = new ConstructorEx("P.C"); //constructor calling
		
	}

}
