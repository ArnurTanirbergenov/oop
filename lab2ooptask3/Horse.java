package lab2ooptask3;

public class Horse extends Piece{
	public Horse(String color) {
		super(color, "Horse");
	}

	@Override
	public boolean isLegalMove(Position a, Position b) {
		int dx = Math.abs(a.x - b.x);
        int dy = Math.abs(a.y - b.y);
		return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
	}
}
