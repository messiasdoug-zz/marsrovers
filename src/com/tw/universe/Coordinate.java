package com.tw.universe;

public class Coordinate {

    private int coordinateX;
    private int coordinateY;

    public Coordinate(final int coordinateX, final int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(coordinateX);
        sb.append(" ");
        sb.append(coordinateY);
        return sb.toString();
    }

    public Coordinate newCoordinate(final int newCoordinateX, final int newCoordinateY) {
        return new Coordinate(this.coordinateX + newCoordinateX, this.coordinateY + newCoordinateY);
    }
}
