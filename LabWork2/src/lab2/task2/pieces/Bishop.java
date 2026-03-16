package lab2.task2.pieces;

import lab2.task2.models.Board;
import lab2.task2.models.Piece;
import lab2.task2.models.Position;

public class Bishop extends Piece {
    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "B" : "b";
    }

    @Override
    public boolean isLegalMove(Board board, Position start, Position end) {
        int dx = Math.abs(end.getX() - start.getX());
        int dy = Math.abs(end.getY() - start.getY());

        if (dx != dy || dx ==  0) return false;

        Piece target = board.getPiece(end);
        if (target != null && target.isWhite() ==  this.isWhite()) return false;

        return board.isPathClear(start, end);

    }
}
