package intro;

public class MethodEx {
	
	public void display() {     //void-dynamic
		
		System.out.println("7.What the hell is the matter with this java classes!!!");
	}
	
	public int add(int a,int b) {     //int-dynamic
		
		return (a+b);
	}
	
	public static void hi() {
		System.out.println("Iam from the static method");
	}
	
	
	public static void main(String args[]) {    //void-static
		
		MethodEx obj = new MethodEx();
		
		obj.display();
		
		System.out.println(obj.add(23, 45));
		
		
		hi();
	}
	

}
