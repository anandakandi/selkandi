package com.collections;

import java.util.ArrayList;

public class ConcurrentListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
//		if (list.contains(3)) {
//			list.remove(3);
			System.out.println(list);
			list.remove(3);
			System.out.println(list);
			list.add("Dsd");
			System.out.println(list);
			if(list.isEmpty()){
				System.out.println("dsdsd");
			}else{
				System.out.println("kkkkkkk");
			}
			
			  if(list.equals("4")) list.set(1, "4");
//		}
	}
}
