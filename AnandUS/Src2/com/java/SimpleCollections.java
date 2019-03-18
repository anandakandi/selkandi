package com.java;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSpinnerUI;

/* This is for example with siple collections
 * 
 */
public class SimpleCollections {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add("foo");
	list.add("bar");
	System.out.println(list.size());
	//iterable the valeus
	for( Object o:list)
		System.out.println(o.toString());
	
	String s = (String)list.get(0);
	System.out.println(s);
	
	
	//anotehr method
	System.out.println("this is ethod type2");
	ArrayList<String> list2 = new ArrayList<>();
	list2.add("sasidhar");
	list2.add("reddy");
	
	for(String p : list2)
		System.out.println(p);
	
	String s2 = list2.get(0);
	System.out.println(s2);
	
	
	//arraylist myclass
	System.out.println("this is for ArrayList<MyClass>");
	
	
	
}
}
