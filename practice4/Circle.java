package practice4;

public class Circle extends Shape {
	private int radius;
	public Circle() {
		
	}
	
	public Circle(int position, Color color, int radius) {
		super(position, color);
		this.radius = radius;
	}
	
	public int radius() {
		return radius;
	}
	@Override
	public void draw() {
		for(int i = 0; i < position; i++) {
			System.out.print(" ");
		}
		if(color == Color.Black) {
			System.out.println("()");
		}
		else System.err.println("()");
	}

}
