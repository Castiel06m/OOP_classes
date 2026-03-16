package lab2.task2.pieces;

import lab2.task2.models.Board;
import lab2.task2.models.Piece;
import lab2.task2.models.Position;

public class Queen extends Piece {

    public Queen(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "Q" : "q";
    }
    @Override
    public boolean isLegalMove(Board board, Position start, Position end) {
        int dx = Math.abs(start.getX() - end.getX());
        int dy = Math.abs(start.getY() - end.getY());

        boolean isStraight = (start.getX() == end.getX() || start.getY() == end.getY());
        boolean isDiagonal = (dx == dy);
        if (!(isStraight || isDiagonal) || (dx == 0 && dy == 0)) return false;

        Piece target = board.getPiece(end);
        if (target != null && target.isWhite() == this.isWhite()) return false;

        return board.isPathClear(start, end);
    }
}
