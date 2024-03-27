package practice3;

public class Animal {
	private String name;
	
	public Animal() {
		this.name = "Unkown";
	}
	public Animal(String name) {
		this.name = name;
	}
	public void speak() {
		System.out.println("Unkown noise");
	}
	public String getName() {
		return this.name;
	}
	public String toString() {
		return this.name;
	}
}
