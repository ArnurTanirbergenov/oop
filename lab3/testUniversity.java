package lab3;

import lab3.University.Day;

public class testUniversity {
	public static void main(String args[]) {
		University info = new University("KBTU");
		University info2 = new University("NU");
		System.out.println("Your uni " +  info.toString());
		System.out.println("Your uni " +  info2.toString(2));
		Day today = Day.MONDAY;
		System.out.println(today);
		System.out.println("Numbers of uni " + University.getCounter());
	}
}
