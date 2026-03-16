package lab2.task2.pieces;

import lab2.task2.models.Board;
import lab2.task2.models.Piece;
import lab2.task2.models.Position;

public class Rook extends Piece {
    public Rook(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "R" : "r";
    }

    @Override
    public boolean isLegalMove(Board board, Position start, Position end) {
        // незя своих же
        Piece target = board.getPiece(end);
        if(target != null && target.isWhite() == this.isWhite()) return false;
        if(start.getX() != end.getX() && start.getY() != end.getY()) return false; // прямо
        return board.isPathClear(start, end);

    }
}
