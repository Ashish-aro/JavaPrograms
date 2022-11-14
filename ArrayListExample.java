package Recursion.SingleBranch;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// Java 1.5 (Generic)
		//CRUD - CREATE READ UPDATE DELETE
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(0, 99);
		list.remove(0);
		list.set(0, 1000);
		System.out.println(list);
		list.forEach(i->System.out.println(i));//implemented in Java 8

	}

}
