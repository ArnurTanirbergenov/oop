package lab3;

public class University{
	enum Day{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY,SUNDAY
	}
	
	private final String unik;
	
	private static int counter = 0;
	public University(String unik) {
        this.unik = unik;
        counter++;
    }
	public static int getCounter() {
		return counter;
	}
	public String toString() {
		return this.unik;
	}
	public String toString(int studyYear) {
		return unik + " Study year: " + studyYear;
	}
	public void printDay(Day Day){
		System.out.println("Today is a " + Day);
	}
	{
		// I don't know what to write in a initialization block so here it is mb you will ask do something dc 
	}
}
