package lab2oop;

public class Cube extends Shapes {
	
	protected double side;
	public Cube() {
		
	}
	public Cube(double side) {
		this.side = side;
	}
	
	@Override
	public double volume() {
		return side* side * side;
	}

	@Override
	public double surfaceArea() {
		return 6 * side * side;
	}

	@Override
	public String toString() {
		return "Side: " + side;
	}

}
