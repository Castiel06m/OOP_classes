package lab2.task2.models;

public abstract class Piece {
    private boolean isWhite;

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public abstract boolean isLegalMove(Board board, Position start, Position end);

    public abstract String getSymbol();
}
