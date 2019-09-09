package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */

		ArrayList<String> ar = new ArrayList<String>();
		// Adding elements
		ar.add("Sonia");
		ar.add("Habib");
		ar.add("Tom");
		ar.add("Rahman");
		ar.add("Zaman");
		ar.add("Khan");
		System.out.println("All the my family names after adding:" + ar);

		// Removing elements
		System.out.println("Getting all my friends name using while loop with Iterator: ");
		Iterator itr = ar.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		ar.remove("Tom");
		System.out.println("Friends name after removing:" + ar);

		System.out.println("--------------------------------");

		for (String str: ar) {
			System.out.println(str);

		}
		// ArrayList contains a given element
		 System.out.println("Does names array contain \"Habib\"? : " + ar.contains("Habib"));
		// first occurrence of an element
		System.out.println("indexOf \"Sonia\": " + ar.indexOf("Sonia"));

		// last occurrence of an element
		System.out.println("indexOf \"Khan\": " + ar.indexOf("Khan"));


	}
}

	

