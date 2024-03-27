package lab33;

public class Cat implements Eatable{
	String name;
	public Cat(String name) {
		this.name = name;
	}

	@Override
	public void move() {
		System.out.println("Cat " + name + " is moving");
		
	}

	@Override
	public void eat() {
		System.out.println("Cat " + name + " is eating");
	}
	
}
