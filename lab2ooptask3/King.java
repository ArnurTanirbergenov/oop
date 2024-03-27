package lab2ooptask3;

public class King extends Piece{
	public King(String color) {
		super(color, "King");
	}

	@Override
	public boolean isLegalMove(Position a, Position b) {
		return Math.abs(a.x - b.x) <= 1 && Math.abs(a.y - b.y) <= 1;
	}
}
