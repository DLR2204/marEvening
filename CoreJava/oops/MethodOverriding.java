package oops;

class ParentA1 {

	public void hi() {
		System.out.println("Iam from the parent class");
	}

	public void add(int a, int b) {

		System.out.println("The sum is :- " + (a * b));
	}

}

public class MethodOverriding extends ParentA1 {

	public static void main(String[] args) {

		MethodOverriding obj = new MethodOverriding();

		obj.hi();

		obj.add(12, 12);

	}

	@Override
	public void add(int a, int b) {

		System.out.println("The sum is :- " + (a + b));
	}

}
