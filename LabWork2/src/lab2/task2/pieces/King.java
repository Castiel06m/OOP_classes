package lab2.task2.pieces;

import lab2.task2.models.Board;
import lab2.task2.models.Piece;
import lab2.task2.models.Position;

public class King extends Piece {
    public King(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "KG" : "kg";
    }

    @Override
    public boolean isLegalMove(Board board, Position start, Position end) {
        int dx = Math.abs(start.getX() - end.getX());
        int dy = Math.abs(start.getY() - end.getY());

        if (dx > 1 || dy > 1 || (dx == 0 && dy == 0)) return false;

        Piece target = board.getPiece(end);
        return target == null || target.isWhite() != this.isWhite();
    }
}
