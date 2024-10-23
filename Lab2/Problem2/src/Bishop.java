public class Bishop extends Piece {
    public Bishop(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int row = Math.abs(a.getRow() - b.getRow());
        int column = Math.abs(a.getColumn() - b.getColumn());
        return (row == column) && b.isValid();
    }

    public String toString() {
        return "Bishop: " +
                super.toString();
    }
}
