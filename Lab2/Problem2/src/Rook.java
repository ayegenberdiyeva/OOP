public class Rook extends Piece {

    public Rook(Position a) {
        super(a);
    }

    public boolean isLegalMove(Position b) {
        return (a.getRow() == b.getRow() || a.getColumn() == b.getColumn()) && b.isValid();
    }

    public String toString() {
        return "Rook: " +
                super.toString();
    }
}
