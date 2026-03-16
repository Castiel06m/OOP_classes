package lab2.task2.models;

import java.util.Objects;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // либоооооооо жесткий и более удобный конструктор
    public Position(char col, int row) {
        this.x = col - 'a';
        this.y = row - 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public boolean isValid(){
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Position)) return false;
        Position p = (Position)obj;
        return x == p.x && y == p.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
