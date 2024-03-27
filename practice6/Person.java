package practice6;

public class Person implements CanHavePizza, Movable, CanHaveParty{
	String name;
	public Person(String name) {
		this.name = name;
	}
	public void payment() {
		System.out.println(name + " pays");
	}
	@Override
	public void eatPizza() {
		payment();
		System.out.println(name + " is eating pizza");
	}
	
	public void move() {
        System.out.println(name + " is moving.");
    }
	public void dance() {
        System.out.println(name + " is dancing.");
    }
}