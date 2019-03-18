package com.oops.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

import org.apache.poi.ss.formula.functions.Value;

public class MapUtil {
	// Program to print all values in a Map using values() in Java
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");

		// 1. using Iterator
		Iterator<String> itr = map.values().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// 2. For-each Loop
		for (String key : map.values()) {
			System.out.println(key );
		}

		// 3. Java 8 - Collection.iterator() + Iterator.forEachRemaining()
		map.values().iterator().forEachRemaining(System.out::println);

		// 4. Java 8 - Collection.stream() + Stream.forEach()
		map.values().stream().forEach(System.out::println);

		// Java 8 - Stream.of() + Collection.toArray() + Stream.forEach()
		Stream.of(map.values().toArray()).forEach(System.out::println);

		// 5. Convert to String
		System.out.println(map.values().toString());

		// Java 8
		Stream.of(map.values().toString()).forEach(System.out::println);
	}
}
