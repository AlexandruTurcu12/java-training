package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;
    private int[] BlackPawns = {0,0,0,0,0,0,0,0};
    private int[] WhitePawns = {0,0,0,0,0,0,0,0};

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {

        if (xCoordinate == 6 && yCoordinate >= 0 && yCoordinate <= 7 && pieceColor == PieceColor.BLACK && BlackPawns[yCoordinate] == 0) {
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            BlackPawns[yCoordinate] = 1;
        } else{
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
        }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if(xCoordinate < 0 || xCoordinate > 7 || yCoordinate < 0 || yCoordinate > 7)
            return false;
        return true;
    }
}
