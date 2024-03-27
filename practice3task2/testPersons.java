package practice3task2;
import java.util.Vector;
public class testPersons {
	public static void main(String args[]) {
		Vector<Person> persons = new Vector();
		
		persons.add(new Person("Arnur", "Satpaeva 90"));
		persons.add(new Student("ArnurButStudent", "Abay 150/230", "IT", 2, 42.999));
		persons.add(new Staff("ArnurNowStaff", "Google maybe", "some school", 192253000.35));
		Person newone = new Student("Elon ", "USA", "Physics", 4, 43232.12);
		persons.add(newone);
		for(Person person: persons) {
			System.out.println(person.toString());
		}
	}
}
