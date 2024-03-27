package practice4;
import java.util.Vector;
public class TestShape {
	public static void main(String[] args) {
		Shape circle = new Circle(5,Color.Black, 3);
		Shape rect = new Rectangle(8, Color.Red, 4);
		Shape trian = new Triangle(10, Color.Black, 1);
		
		Vector<Shape> shapes = new Vector<Shape>();
		
		shapes.add(rect);
		shapes.add(circle);
		shapes.add(trian);
		
		for(Shape shape: shapes) {
			shape.draw();
		}
		
	}
	
}
