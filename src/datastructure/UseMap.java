package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<String, List<String>> newMap = new HashMap<>();

		//palindromes.put("a", Arrays.asList("A nut for a jar of tuna", "Avid diva"));
		//palindromes.put("b", Arrays.asList("Borrow or rob", "Bombard a drab mob"));
		newMap.put("0", Arrays.asList("Java"));
		newMap.put("1",Arrays.asList("Oracle"));
		newMap.put("2",Arrays.asList("BigData"));
		newMap.put("3",Arrays.asList("ArtificialIntelligence"));
		newMap.put("4",Arrays.asList("Python"));

		System.out.println("The Map items by using iterator interface:");

		Iterator it = newMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey() + " ComputerLanguages: " + pair.getValue());
		}

		System.out.println("\nThe Map items by using For Each:");
		for(String key: newMap.keySet()) {
			System.out.println(key + " computerLanguages: ");
			for(String item: newMap.get(key))
				System.out.println(item);
			System.out.println();
		}

	}

}
