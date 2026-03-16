package lab2.task2.models;

import lab2.task2.pieces.*;

public class Board {
    private Piece[][] grid = new Piece[8][8];

    public void setPiece(Position pos, Piece piece) {
        if (pos.isValid()) grid[pos.getX()][pos.getY()] = piece;
    }

    public Piece getPiece(Position pos) {
        if (!pos.isValid()) return null;
        return grid[pos.getX()][pos.getY()];
    }

    public boolean isPathClear(Position start, Position end) {
        int dx = Integer.compare(end.getX(), start.getX());
        int dy = Integer.compare(end.getY(), start.getY());

        int curX = start.getX() + dx;
        int curY = start.getY() + dy;

        while (curX != end.getX() || curY != end.getY()) {
            if (grid[curX][curY] != null) return false;
            curX += dx;
            curY += dy;
        }
        return true;
    }

    public void movePiece(Position start, Position end) {
        grid[end.getX()][end.getY()] = grid[start.getX()][start.getY()];
        grid[start.getX()][start.getY()] = null;
    }

    public void draw() {
        System.out.println("\n  a b c d e f g h");
        for (int y = 7; y >= 0; y--) {
            System.out.print((y + 1) + " ");
            for (int x = 0; x < 8; x++) {
                Piece p = grid[x][y];
                System.out.print((p == null ? "." : p.getSymbol()) + " ");
            }
            System.out.println(y + 1);
        }
        System.out.println("  a b c d e f g h\n");
    }

    public void setupStandardBoard() {
        for (int i = 0; i < 8; i++) {
            setPiece(new Position(i, 1), new Pawn(true));
            setPiece(new Position(i, 6), new Pawn(false));
        }
        setupRow(0, true);
        setupRow(7, false);
    }

    private void setupRow(int row, boolean isWhite) {
        setPiece(new Position(0, row), new Rook(isWhite));
        setPiece(new Position(1, row), new Knight(isWhite));
        setPiece(new Position(2, row), new Bishop(isWhite));
        setPiece(new Position(3, row), new Queen(isWhite));
        setPiece(new Position(4, row), new King(isWhite));
        setPiece(new Position(5, row), new Bishop(isWhite));
        setPiece(new Position(6, row), new Knight(isWhite));
        setPiece(new Position(7, row), new Rook(isWhite));
    }
}