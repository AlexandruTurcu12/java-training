package clean.code.chess.requirements;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public ChessBoard getChesssBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int value) {
        this.xCoordinate = value;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int value) {
        this.yCoordinate = value;
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    private void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public void Move(MovementType movementType, int newX, int newY) {

        if(getPieceColor() == PieceColor.BLACK && getYCoordinate() == 6) {
            if(newX != getXCoordinate()){
                newX = getXCoordinate();
                newY = getYCoordinate();
            } else {
                setYCoordinate(4);
                newX = getXCoordinate();
                newY = getYCoordinate();
            }
        }
        else if(getPieceColor() == PieceColor.BLACK && getYCoordinate() < 6){
            if(newX != getXCoordinate()){
                newX = getXCoordinate();
                newY = getYCoordinate();
            } else {
                int value = getYCoordinate();
                value--;
                setYCoordinate(value);
                newX = getXCoordinate();
                newY = getYCoordinate();
            }
        }

        if(getPieceColor() == PieceColor.WHITE && getYCoordinate() == 1) {
            if(newX != getXCoordinate()){
                newX = getXCoordinate();
                newY = getYCoordinate();
            } else {
                setYCoordinate(3);
                newX = getXCoordinate();
                newY = getYCoordinate();
            }
        }
        else if(getPieceColor() == PieceColor.WHITE && getYCoordinate() > 1){
            if(newX != getXCoordinate()){
                newX = getXCoordinate();
                newY = getYCoordinate();
            } else {
                int value = getYCoordinate();
                value++;
                setYCoordinate(value);
                newX = getXCoordinate();
                newY = getYCoordinate();
            }
        }
    }

    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
    }
}
