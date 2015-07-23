package com.marsrover;

// This class Represents the Position of rover and methods to navigate it.
public class Rover {
    private int xCoordinate;
    private int yCoordinate;
    private char direction;

    public Rover(int xCoordinate, int yCoordinate, char direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    public Rover navigateTo(String instruction) {
        return new Rover(this.xCoordinate, this.yCoordinate, this.direction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        if (xCoordinate != rover.xCoordinate) return false;
        if (yCoordinate != rover.yCoordinate) return false;
        return direction == rover.direction;

    }

    @Override
    public int hashCode() {
        int result = xCoordinate;
        result = 31 * result + yCoordinate;
        result = 31 * result + (int) direction;
        return result;
    }
}
