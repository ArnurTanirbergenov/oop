package lab2ooptask3;

public class Bishop extends Piece {
	public Bishop(String color) {
		super(color, "Bishop");
	}
	@Override
	public boolean isLegalMove(Position a, Position b) {
		int dx = Math.abs(a.x - b.x);
        int dy = Math.abs(a.y - b.y);

        return dx == dy;
	}
	

}
