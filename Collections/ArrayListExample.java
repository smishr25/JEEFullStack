import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.add(1, "Gaurav");

		System.out.println(list);
		list.remove("Vijay");
		System.out.println("After invoking remove(object) method: " + list);
		list.remove(0);
		System.out.println("After invoking remove(index) method: " + list);
		System.out.println("Is ArrayList Empty: " + list.isEmpty());
		System.out.println("Before update: " + list.get(0));
		list.set(1, "Gaurav");
		System.out.println("After update: " + list.get(0));
		
		System.out.println("Final Array List: " + list);


	}

}
