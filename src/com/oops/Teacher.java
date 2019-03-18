package com.oops;

public class Teacher {
	private String designation = "Teacher";
	   private String collegeName = "Beginnersbook";
	   public String getDesignation() {
		return designation;
	   }
	   protected void setDesignation(String designation) {
		this.designation = designation;
	   }
	   protected String getCollegeName() {
		return collegeName;
	   }
	   protected void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	   }
	   // if this class is in different package then we have to give accessor modifier as public or protected
	   void does(){
		System.out.println("Teaching");
	   }
}
