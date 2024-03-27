package lab3;

public class Person {
	private Gender gender;
	public Person(Gender gender) {
		this.gender = gender;
	}
	public String toString() {
		return gender.toString();
	}
}
