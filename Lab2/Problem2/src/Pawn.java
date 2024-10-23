public class Pawn extends Piece {
    public Pawn(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int row = b.getRow() - a.getRow();
        int column = Math.abs(a.getColumn() - b.getColumn());
        return row == 1 && column == 1 && b.isValid();
    }

    public String toString(){
        return "Pawn: "
                + super.toString();
    }
}
