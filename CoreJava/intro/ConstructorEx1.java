package intro;

public class ConstructorEx1 {

	public ConstructorEx1() {
		this("ant"); // constructor calling
	}

	public ConstructorEx1(String name) {

		this("bat", "cat");
		System.out.println(name);

	}

	public ConstructorEx1(String name, String name1) {
		this("den", "egg", "fan");
		System.out.println(name + "\t" + name1);
	}

	public ConstructorEx1(String name, String name1, String name2) {
		this("gun", "hen", "ink", "jam");
		System.out.println(name + "\t" + name1 + "\t" + name2);
	}

	public ConstructorEx1(String name, String name1, String name2, String name3) {

		System.out.println(name + "\t" + name1 + "\t" + name2 + "\t" + name3);
	}

	public static void main(String[] args) {

		ConstructorEx1 obj = new ConstructorEx1();
	}

}
