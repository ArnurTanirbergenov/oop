package practice3;

public class testAnimal {
	public static void main(String args[]) {
		Animal unkownAnimal = new Animal("lol");
		Animal doggy = new Dog("Hatiko", "meat");
		
		unkownAnimal.speak();
		System.out.println(unkownAnimal.toString());
		
		doggy.speak();
		System.out.println(doggy.toString());
		
		}
}
