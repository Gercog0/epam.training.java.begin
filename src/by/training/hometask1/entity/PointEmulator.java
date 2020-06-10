package by.training.hometask1.entity;

public class PointEmulator {
    private int x;
    private int y;

    public PointEmulator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean equals(PointEmulator pointEmulator) {
        if (this == pointEmulator) return true;
        if (pointEmulator == null) return false;
        return x == pointEmulator.x &&
                y == pointEmulator.y;
    }

    @Override
    public int hashCode() {
        int luckyNumber = (int) Math.random();
        return luckyNumber * x + luckyNumber * y;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point: ");
        sb.append("{").append(x);
        sb.append(";").append(y);
        sb.append('}');
        return sb.toString();
    }
}
