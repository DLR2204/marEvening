package oops;

interface ParentA {
	
	public void add(int a,int b);

}

interface ParentB {

	public void add(int a,int b);
}

public class Child2 implements ParentA, ParentB {

	public static void main(String[] args) {
		
		Child2 obj = new Child2();
		
		
		obj.add(23, 56);
	}

	@Override
	public void add(int a, int b) {
		System.out.println(a+b);
		
	}
}
