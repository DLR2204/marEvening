package oops;

class Parent{
	
	public void display() {
		System.out.println("Iam from the parent class");
	}
	
	public int add(int a,int b) {
		return (a+b);
	}
	
}


public class Child extends Parent{
	
	public static void main(String[] args) {
		
		Child obj = new Child();
		
		obj.display();
		
		System.out.println(obj.add(23, 23));
		
	}

}
