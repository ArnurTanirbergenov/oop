package lab2ooptask3;

class Queen extends Piece {
    public Queen(String color) {
        super("Queen", color);
    }

    @Override
    public boolean isLegalMove(Position a, Position b) {
        int dx = Math.abs(a.x - b.x);
        int dy = Math.abs(a.y - b.y);

        // horizontally, vertically,diagonally
        return dx == dy || a.x == b.x || a.y == b.y;
    }
}
