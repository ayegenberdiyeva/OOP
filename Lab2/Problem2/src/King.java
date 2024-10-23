public class King extends Piece {
    public King(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int row = Math.abs(a.getRow() - b.getRow());
        int column = Math.abs(a.getColumn() - b.getColumn());
        return row<=1 && column<=1 && b.isValid();
    }

    public String toString() {
        return "King: "
                + super.toString();
    }
}
