public class Queen extends Piece {
    public Queen(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int row = Math.abs(a.getRow() - b.getRow());
        int column = Math.abs(a.getColumn() - b.getColumn());
        return (a.getRow() == b.getRow() || a.getColumn() == b.getColumn() || row == column) && b.isValid();
    }

    public String toString() {
        return "Queen: "
                + super.toString();
    }
}
