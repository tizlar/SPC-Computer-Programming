package application;

public class WhatIsEnum {
	static enum weekDay  {Sun,Mon,Tue,Wed,Thu,Fri,Sat};
	
	public static void main(String[] args) {
		weekDay day0 = weekDay.Mon;
		weekDay day4 = weekDay.Fri;
		
		System.out.println(day0);
		System.out.println(day4.name());
		
		System.out.println(day0.ordinal());
		System.out.println(weekDay.Wed + " is day " +weekDay.Wed.ordinal());
		
		weekDay[] days = weekDay.values();	

		System.out.println("Using a for loop");
		for(int i = 0; i < 5; i++) {
			System.out.print(days[i] + " ");
		}
		
		System.out.println("\nUsing a foreach loop");
		for(weekDay d : days) {
			System.out.print(d + " "); 
		}
		
		dayOfWeek(day4);
	}
	
	public static void dayOfWeek(weekDay d) {
		System.out.println(d.name() + " is day " + d.ordinal() + " of the week");
	}
}
