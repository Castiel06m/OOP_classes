package lab2.task2.pieces;

import lab2.task2.models.Board;
import lab2.task2.models.Piece;
import lab2.task2.models.Position;

public class Knight extends Piece {
    public Knight(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "KN" : "kn";
    }

    @Override
    public boolean isLegalMove(Board board, Position start, Position end) {
        int dx = Math.abs(end.getX() - start.getX());
        int dy = Math.abs(end.getY() - start.getY());

        boolean isLmove = (dx == 1 && dy == 2) ||  (dx == 2 && dy == 1);
        if (!isLmove) return false;

        Piece target = board.getPiece(end);
        return target == null || target.isWhite() != this.isWhite();
    }
}
