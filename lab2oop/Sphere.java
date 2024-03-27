package lab2oop;

public class Sphere extends Shapes{
	
	protected double radius;
	
	public Sphere() {
		
	}
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	@Override
	public double volume() {
		return 4 * 3.14 * radius * radius * radius / 3;
	}

	@Override
	public double surfaceArea() {
		return 4 * 3.14 * radius * radius;
	}

	@Override
	public String toString() {
		return "Radius: " + radius;
	}
	
}
