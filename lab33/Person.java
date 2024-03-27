package lab33;

public class Person {
	public String name;
	private int age;
	private String surname;
	public Person() {
		
	}
	public Person(String name, int age, String surname) {
		this.name = name;
		this.age = age;
		this.surname = surname;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return this.name + " Age " + this.age + " Surname " + this.surname;
	}
	public boolean equals(Object o) {
		if(this == o)return true;
		if(o == null)return false;
		if(this.getClass() != o.getClass())return false;
		Person p = (Person)o;
		return this.age == p.age && this.name.equals(p.name) && this.surname.equals(p.surname);
	}
}
