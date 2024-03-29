package model;

import util.StreamUtil;

import java.util.Objects;

public class Position {
    private int x;


    @Override
    public String toString() {
        return "{" + x + ", " + y + '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Position() {
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position shift(int dx, int dy) {
        return new Position(x + dx, y + dy);
    }

    public static Position readFrom(java.io.InputStream stream) throws java.io.IOException {
        Position result = new Position();
        result.x = StreamUtil.readInt(stream);
        result.y = StreamUtil.readInt(stream);
        return result;
    }

    public void writeTo(java.io.OutputStream stream) throws java.io.IOException {
        StreamUtil.writeInt(stream, x);
        StreamUtil.writeInt(stream, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x &&
                y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public int distTo(Position p) {
        return Math.abs(p.x - x) + Math.abs(p.y - y);
    }

    public int distTo(int ox, int oy) {
        return Math.abs(ox - x) + Math.abs(oy - y);
    }
}
