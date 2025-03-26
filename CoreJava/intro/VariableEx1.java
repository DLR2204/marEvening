package intro;

public class VariableEx1 {
	
	static String name = "Apple";  //static g.v
	
	String name1 = "Parrot";   //instance g.v
	

	
public static void main(String[] args) {
		
	VariableEx1 obj = new VariableEx1();	 //object creation
		
	System.out.println(obj.name1);	
		
	System.out.println(name);	
	
	}
	

}
