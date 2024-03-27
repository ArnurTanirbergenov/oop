package lab3;

public class testDragonLaunch {
	public static void main(String args[]) {
		DragonLaunch dragonlaunch = new DragonLaunch();

		dragonlaunch.kidnap(new Person(Gender.BOY));
		dragonlaunch.kidnap(new Person(Gender.GIRL));
		dragonlaunch.kidnap(new Person(Gender.GIRL));
		if(dragonlaunch.willDragonEatOrNot()) {
			System.out.println("Not today");
		}
		else System.out.println("Easy lunch");
	}
}
