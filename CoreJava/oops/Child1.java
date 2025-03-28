package oops;

class GrandParent1 {

	public void display() {
		System.out.println("Iam from the grandParent");
	}
}

class Parent1 extends GrandParent1 {
	public void hello() {
		System.out.println("Iam from the parent class");
	}

}

public class Child1 extends Parent1{

	public static void main(String[] args) {
		
		Child1 obj = new Child1();
		
		obj.display();
		
		obj.hello();
		
	}
}
