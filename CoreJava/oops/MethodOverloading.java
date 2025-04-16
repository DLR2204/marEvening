package oops;

public class MethodOverloading {

	public void add(int a,int b) {
		System.out.println("6.sum of 2 integers is :- "+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("9.sum of 3 integers is :- "+(a+b+c));
	}
	public void add(int a,float b) {
		System.out.println("12.sum of int,float is :- "+(a+b));
	}
	public void add(float a,int b) {
		System.out.println("15.sum of float,int is :- "+(a+b));
	}
	public void add(float a,float b) {
		System.out.println("18.sum of 2 floats is :- "+(a+b));
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.add(12f, 12f);
		
		
		
	}
	
	
}
