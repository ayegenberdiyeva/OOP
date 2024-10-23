public class Board {
    private Piece[][] board;

    public Board() {
        board = new Piece[8][8];
        initializeBoard();
    }

    private void initializeBoard() {
        board[0][0] = new Rook(new Position(0, 0));
        board[0][1] = new Knight(new Position(0, 1));
        board[0][2] = new Bishop(new Position(0, 2));
        board[0][3] = new Queen(new Position(0, 3));
        board[0][4] = new King(new Position(0, 4));
        board[0][5] = new Bishop(new Position(0, 5));
        board[0][6] = new Knight(new Position(0, 6));
        board[0][7] = new Rook(new Position(0, 7));

        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(new Position(1, i));
        }
    }

    public boolean move(Position from, Position to) {
        Piece piece = board[from.getRow()][from.getColumn()];
        if (piece != null && piece.isLegalMove(to)) {
            board[to.getRow()][to.getColumn()] = piece;
            board[from.getRow()][from.getColumn()] = null;
            return true;
        } else {
            System.out.println("Illegal move");
            return false;
        }
    }

    public void drawBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getClass().getSimpleName().charAt(0) + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
