public abstract class Piece {
    protected Position a;

    public Piece(Position a){
        this.a = a;
    }

    public abstract boolean isLegalMove(Position b);

    public String toString(){
        return "Piece: "+
                " position: "+a;
    }
}
