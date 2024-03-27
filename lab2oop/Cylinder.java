package lab2oop;

public class Cylinder extends Shapes {
	
	protected double radius;
	
	protected double height;
	
	public Cylinder() {
	}
	
	public Cylinder(double radius, double height) {
		this.height = height;
		this.radius = radius;
	}
	
	public double volume() {
		return 3.14 * radius* radius * height;
	};
	
	public double surfaceArea() {
		return 2 * 3.14 * radius * (height + radius);
	}
	
	public String toString() {
		return "Radius: " + radius + " Height: " + height;
	}
}
