package practice6;

import java.util.Vector;

public class TestPractice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant restaurant = new Restaurant();
        Cat cat = new Cat("Kitty");
        Student student = new Student("Arnur", 2203);
        Person person = new Person("Thor");
        
        Vector<CanHavePizza> pizzaeaters = new Vector<CanHavePizza>();
        pizzaeaters.add(person);
        pizzaeaters.add(student);
        pizzaeaters.add(cat);
        
        for(CanHavePizza eater : pizzaeaters) {
        	restaurant.servePizza(eater);
        }
        
        student.dance();
        student.move();
        student.retake();
	}
}