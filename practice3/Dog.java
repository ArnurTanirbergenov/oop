package practice3;

public class Dog extends Animal{
	private String dogFood;
	public Dog() {
		super();
		this.dogFood = "dont know";
	}
	public Dog(String name, String dogfood) {
		super(name);
		this.dogFood = dogfood;
	}
	
	public void speak() {
		System.out.println("bark");
	}
	
	
	public String toString() {
		return "Name " + getName() + " Food " + dogFood;
	}
}
