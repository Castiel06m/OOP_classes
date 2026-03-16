package lab2.task2.pieces;

import lab2.task2.models.Board;
import lab2.task2.models.Piece;
import lab2.task2.models.Position;

public class Pawn extends Piece {
    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite() ? "P" : "p";
    }

    @Override
    public boolean isLegalMove(Board board, Position start, Position end) {
        int dx = end.getX() - start.getX();
        int dy = end.getY() - start.getY();

        // Направление: белые идут +1 по Y, черные -1
        int direction = isWhite() ? 1 : -1;
        int startRow = isWhite() ? 1 : 6; // Вторая линия для белых (индекс 1) и седьмая для черных (индекс 6)

        Piece target = board.getPiece(end);

        // 1. Ход прямо на 1 клетку
        if (dx == 0 && dy == direction) {
            return target == null; // Только в пустую клетку
        }

        // 2. Ход прямо на 2 клетки (первый ход)
        if (dx == 0 && dy == 2 * direction && start.getY() == startRow) {
            Position mid = new Position(start.getX(), start.getY() + direction);
            return target == null && board.getPiece(mid) == null; // Путь и цель свободны
        }

        // 3. Удар по диагонали
        if (Math.abs(dx) == 1 && dy == direction) {
            return target != null && target.isWhite() != this.isWhite(); // Только если там враг
        }

        return false;
    }
}
