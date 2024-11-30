package jcf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

public class Examples {
public static void main(String[] args) {
	
	// List: Maintains insertion order. Allows duplicates
	List<String> names = new ArrayList<>();
	names.add("Alice");
	names.add("Bob");
	names.add("Bob"); // allows duplicate
	names.add("Yetty");
	System.out.println(names);
//	
	// Set: No duplicate elements. 
	Set<String> set = new HashSet<>();
	set.add("apple");
	set.add("banana");
	set.add("apple"); // Duplicate, ignored
	System.out.println(set); // Output: [banana, apple] (order may vary)
////	
	//Queue
	Queue<String> queue = new LinkedList<>();       
	queue.add("apple");  
	queue.add("mango");
	queue.add("banana");        
	queue.add("apple"); // Duplicate allowed        
	System.out.println(queue); // Output: [apple, banana, apple]
//
////
////	
	//Map
	Map<Integer, String> map = new HashMap<>();        
	map.put(1, "apple");        
	map.put(2, "banana");        
	map.put(1, "orange"); // Overwrites the previous value for key 1  
	map.put(3, "banana");  // preserves the value
	System.out.println(map); // Output: {1=orange, 2=banana}

	//Exercise
	final Collection<String> myCollection = new ArrayList<>();
	myCollection.add("Pineapple");
	myCollection.add("Banana");
	myCollection.add("Orange");
	myCollection.add("Apple");
	myCollection.add("Watermelon");

	final Iterator<String> myIterator = myCollection.iterator();
	while(myIterator.hasNext()) {
		final String str = myIterator.next();
		if (str.toLowerCase().contains("an")) {
			System.out.printf("%s%n", str);
		}
		
		Map<String, Double> m = new LinkedHashMap<>();

		m.put("Booger", 1.);
		m.put("Rotten Egg", 1.5);
		m.put("Vomit", 1.);
		m.put("Cherry", 2.);

		p(m);	
		inc(m, 0.5);
		p(m);	

		
		
	}

}

public static void p(Map<?,? extends Number> m) {
	for (Entry<?, ? extends Number> e : m.entrySet()) {
		System.out.printf("%s=%.2f%n", e.getKey(), e.getValue().doubleValue());
	}
	System.out.printf("%n");
}

public static <K> void inc(Map<K, ? super Double> m, double amt) {
	for (K k : m.keySet()) {
		m.replace(k, (double) m.get(k) + amt);
	}
}


}
