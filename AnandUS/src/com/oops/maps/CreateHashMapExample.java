package com.oops.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CreateHashMapExample {
	public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> numberMapping = new HashMap<>();

        // Adding key-value pairs to a HashMap
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);
        numberMapping.put("Four", 4);
        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
       

        System.out.println(numberMapping);
        int s = numberMapping.size();
       
        
     // 1. using Iterator
     		Iterator<Integer> itr = numberMapping.values().iterator();
     		while (itr.hasNext()) {
     			System.out.println(itr.next());
     		}
     		
     		
//       numberMapping.forEach((key, value) -> System.out.println(key + " : " + value));
    }

}
