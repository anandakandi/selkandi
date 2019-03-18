package com.enumTest;

public class TestEnumClasses {
	Day day;
	enum Color{
		RED, BLUE, GREEN;
	}
	public static void main(String[] args) {
		
		System.out.println(Color.BLUE);
		System.out.println(Day.FRIDAY);
		TestEnumClasses firstDay = new TestEnumClasses(Day.MONDAY);
        firstDay.tellItLikeItIs();
        
	}
	public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
	enum Day{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	 public TestEnumClasses(Day day) {
	        this.day = day;
	    }
	
}
