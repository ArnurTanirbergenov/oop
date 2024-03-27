package practice4;

public class Rectangle extends Shape {
	private int side;
	public Rectangle() {
		
	}
	public Rectangle(int position, Color color, int side) {
		super(position, color);
		this.side = side;
	}
	public int getSide() {
		return side;
	}
	@Override
	public void draw() {
		for(int i = 0; i < position; i++) {
			System.out.print(" ");
		}
		if(color == Color.Black) {
			System.out.println("[]");
		}
		else System.err.println("[]");
	}
}
