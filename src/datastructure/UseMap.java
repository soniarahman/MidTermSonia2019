package datastructure;

import java.awt.*;
import java.util.*;
import java.util.List;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


		// Creating Map instance
		Map m = new HashMap();

		//Sorting and inserting elements
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("One", "Lean Manufacturing Certificate");
		map1.put("Two", "PMP Certificate");
		map1.put("Three", "SalesForce Certificate");

		// Retrieving element from another map

		map1.put("Three", "SalesForce Certificate");
		Map map2 = new HashMap();
		map2.putAll(map1);

		// getting value stored in map1

		String certificationRequires = (String) map1.get("1");

		//getting default value
		Map map = new HashMap();
		Object value = map1.getOrDefault("5", "default value");


		//Iterator While loop
		List<String> mylist = new ArrayList<String>();

		mylist.add("BMW");
		mylist.add("TOYOTA");
		mylist.add("HONDA");
		mylist.add("NISSAN");




		String firstObject = (String) mylist.get(0);
		Iterator iterator = mylist.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
		}

		//value Iterator while loop

		Iterator iterator2 = map1.values().iterator();

		while (iterator2.hasNext()) {
			iterator2.next();
		}
	}
}




