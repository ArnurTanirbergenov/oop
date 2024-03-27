package practice6;

public class Cat extends Animal implements CanHavePizza{
	public Cat(String name) {
		super(name);
	}
	public void eatPizza() {
		System.out.println(name + " is eating pizza.");
	}
}