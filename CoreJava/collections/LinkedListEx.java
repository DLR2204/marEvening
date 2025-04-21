package collections;

import java.util.LinkedList;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add(123);

		ll.add("apple");

		ll.add(3.14f);

		ll.add('c');

		ll.add(true);

		System.out.println(ll);

		ll.add(123);

		ll.add("apple");

		ll.add(3.14f);

		ll.add('c');

		ll.add(true);

		System.out.println(ll);
	}

}
