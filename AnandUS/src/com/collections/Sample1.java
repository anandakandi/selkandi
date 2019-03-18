package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sample1 {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<>();
		strList.add("afs");
		strList.add("afs");
		strList.add("afs");
		strList.add("afs");
		strList.add("afs");
		strList.add("afs");

		// for each loop
		for (String s : strList) {
			System.out.println(s);
		}

		System.out.println("this is iterator");
		// use iterator
		Iterator<String> ss = strList.iterator();
		while (ss.hasNext()) {
			String sk = ss.next();
			System.out.println(sk);
		}

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println("Initial list of elements: " + hm);
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		// for each loop
		for (Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		hm.putIfAbsent(103, "Gaurav");  
		
		System.out.println("After invoking putIfAbsent() method ");  
	      for(Entry<Integer, String> m:hm.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }
	      HashMap<Integer,String> map=new HashMap<Integer,String>();  
	      map.put(104,"Ravi");  
	      map.putAll(hm);  
	      System.out.println("After invoking putAll() method ");  
	      for(Map.Entry m:map.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }  
	}
}
