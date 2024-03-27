package lab2ooptask3;

public class Rook extends Piece {
	public Rook(String color) {
		super(color, "Rook");
	}
	
	public boolean isLegalMove(Position a, Position b) {
		return a.x == b.x || a.y == b.y;
	}
	
}
