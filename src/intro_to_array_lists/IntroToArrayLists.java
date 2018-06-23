package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> fruit = new ArrayList<String>();
		// 2. Add five no 6 Strings to your list
		fruit.add("stirng");
		fruit.add("stinrg");
		fruit.add("stirng");
		fruit.add("histringin");
		fruit.add("blank");
		fruit.add("ihadtomakethiscuzof#7itneedsane");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < fruit.size(); i++) {
			System.out.println(fruit.get(i));
		}
		// 4. Print all the Strings using a for-each loop
		for (String s : fruit) {
			System.out.println(s);
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < fruit.size(); i += 2) {
			System.out.println(fruit.get(i));
		}
		// 6. Print all the Strings in reverse order.
		for (int i = fruit.size() - 1; i >= 0; i--) {
			System.out.println(fruit.get(i));
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		for (String s : fruit) {
			if (s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
