package com.switchTest;

public class TestSwitchDemo {
public static void main(String[] args) {
	
	String name = "asidhar";
	
	switch (name) {
	case "sasidhar":
		System.out.println("this si sasidhar");
		break;
	case "asidhar":
		System.out.println("this si asidhar swith account");
//		break;
	case "mama":
		System.out.println("this si mama");
		
	break;
	default:
		System.out.println("Hello default");
//		break;
	}
}
}
