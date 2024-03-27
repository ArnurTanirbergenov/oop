package lab2ooptask3;

public abstract class Piece {
	String color;
	String name;
	
	public Piece() {
	}
	public Piece(String color, String name) {
		this.color = color;
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public abstract boolean isLegalMove(Position a, Position b);
	
}
