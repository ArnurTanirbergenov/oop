package lab2ooptask3;

public class Pawn extends Piece{
	
	public Pawn(String color) {
		super(color, "Pawn");
	}
	@Override
	public boolean isLegalMove(Position a, Position b) {
		int dx = Math.abs(a.x - b.x);
        int dy = b.y - a.y; // Positive if moving forward for white, negative if moving forward for black

        if (getColor().equalsIgnoreCase("White")) {
            if (dx == 0 && dy == 1) {
                return true; // Moving one square forward
            } else if (dx == 0 && dy == 2 && a.y == 1) {
                return true; // Moving two squares forward as the first move
            } else if (dx == 1 && dy == 1) {
                return true; // Capturing an opponent's piece diagonally
            }
        } else if (getColor().equalsIgnoreCase("Black")) {
            if (dx == 0 && dy == -1) {
                return true; // Moving one square forward
            } else if (dx == 0 && dy == -2 && a.y == 6) {
                return true; // Moving two squares forward as the first move
            } else if (dx == 1 && dy == -1) {
                return true; // Capturing an opponent's piece diagonally
            }
        }

        return false;
    }
	
}	