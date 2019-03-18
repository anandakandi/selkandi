package com.oops.interfaces;

public interface InterFaceA {

	public void m1();
	private void m2();// compilation erros.. interface don;t allow any other access modifiers except public
	protected void m3();
	final void m4();
//	
	public void m5(){
		
	} // interface donot allow method body except static method and default methods
	
	void m8();
	abstract void m9();
	public static void m6(){
		System.out.println("this is static method in interface.");
	}
	
	public default void m7(){
		System.out.println("this is default method in interface.");
	}
	
	
	
}
