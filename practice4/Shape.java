package practice4;

public abstract class Shape {
	int position;
	Color color;
	public Shape() {
		
	}
	public Shape(int position, Color color) {
		this.position = position;
		this.color = color;
	}
	public abstract void draw();
	
	
}
