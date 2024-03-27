package practice6;

public class Student extends Person implements CanHaveRetake{
	int id;
	public Student(String name, int id) {
		super(name);
		this.id = id;
	}
    
    public void retake() {
    	System.out.println(name + " has retake.");
    }
}