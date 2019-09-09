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
      /* Map <String, String> m = new Map<String, String>();
        m.put("Name",  "Sonia");
        m.put("Hobby", "Dance");



        m.get("Name"); */

		// Creating Map instance
		Map map1 = new HashMap();
		Map mapB = new TreeMap();

		//Sorting and inserting elements

		map1.put("1", "Lean Manufacturing Certificate");
		map1.put("2", "PMP Certificate");
		map1.put("3", "SalesForce Certificate");

		// Retrieving element from another map

		map1.put("3", "SalesForce Certificate");
		Map map2 = new HashMap();
		map2.putAll(map1);

		// getting value stored in map1

		String certificationRequires = (String) map1.get("1");

		//getting default value
		Map map = new HashMap();
		Object value = map1.getOrDefault("5", "default value");

		//Iterator While loop
		List mylist = new ArrayList();

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

		//



		Scanner s = new Scanner("car         toyota\n" +
				"car         bmw\n" +
				"car         honda\n" +
				"fruit       apple\n" +
				"fruit       banana\n" +
				"computer    acer\n" +
				"computer    asus\n" +
				"computer    ibm");

		Map<String, List<String>> map5 = new LinkedHashMap<String, List<String>>();

		while (s.hasNext()) {

			String key = s.next();
			if (!map5.containsKey(key))
				map5.put(key, new LinkedList<String>());

			map5.get(key).add(s.next());
		}

		System.out.println(map5);



	}

}




