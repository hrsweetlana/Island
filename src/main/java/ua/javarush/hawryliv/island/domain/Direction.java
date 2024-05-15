package ua.javarush.hawryliv.island.domain;

public enum Direction {
    RIGHT(1, 0), LEFT(-1, 0), UP(0, -1), DOWN(0,1);

    private int deltaX;
    private int deltaY;

    public int getDeltaX() {
        return deltaX;
    }

    public int getDeltaY() {
        return deltaY;
    }

    Direction(int deltaX, int deltaY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }
}
