package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoverTest {
    Rover rover;

    @Test
    public void positionAndDirectionDoesNotChangeWhenRoverTurnsLeftAndRight() {
        rover = new Rover(1, 2, 'N');

        assertEquals(new Rover(1, 2, 'N'), rover.navigateTo("LR"));
    }

    @Test
    public void directionChangesToNorthWhenRoverTurnsLeftFromEast() {
        rover = new Rover(1, 2, 'E');

        assertEquals(new Rover(1, 2, 'N'), rover.navigateTo("L"));
    }

    @Test
    public void directionChangesToWestWhenRoverTurnsLeftFromNorth() {
        rover = new Rover(0, 0, 'N');

        assertEquals(new Rover(0, 0, 'W'), rover.navigateTo("L"));
    }

    @Test
    public void directionChangesToSouthWhenRoverTurnsLeftFromWest() {
        rover = new Rover(0, 0, 'W');

        assertEquals(new Rover(0, 0, 'S'), rover.navigateTo("L"));
    }

    @Test
    public void directionChangesToEastWhenRoverTurnsLeftFromSouth() {
        rover = new Rover(0, 0, 'S');

        assertEquals(new Rover(0, 0, 'E'), rover.navigateTo("L"));
    }

    @Test
    public void directionChangesToNorthWhenRoverTurnsRightFromWest() {
        rover = new Rover(0, 0, 'W');

        assertEquals(new Rover(0, 0, 'N'), rover.navigateTo("R"));
    }

    @Test
    public void directionChangesToWestWhenRoverTurnsRightFromSouth() {
        rover = new Rover(0, 0, 'S');

        assertEquals(new Rover(0, 0, 'W'), rover.navigateTo("R"));
    }

    @Test
    public void directionChangesToSouthtWhenRoverTurnsRightFromEast() {
        rover = new Rover(0, 0, 'E');

        assertEquals(new Rover(0, 0, 'S'), rover.navigateTo("R"));
    }

    @Test
    public void directionChangesToEastWhenRoverTurnsRightFromNorth() {
        rover = new Rover(0, 0, 'N');

        assertEquals(new Rover(0, 0, 'E'), rover.navigateTo("R"));
    }

    @Test
    public void yCoordinateIncreasesFrom1TO2WhenRoverMovesInNorth() {
        rover = new Rover(1, 1, 'N');

        assertEquals(new Rover(1, 2, 'N'), rover.navigateTo("M"));
    }

    @Test
    public void yCoordinateDecreasesFrom1TO0WhenRoverMovesInSouth() {
        rover = new Rover(1, 1, 'S');

        assertEquals(new Rover(1, 0, 'S'), rover.navigateTo("M"));
    }

    @Test
    public void xCoordinateIncreasesFrom1TO2WhenRoverMovesInEast() {
        rover = new Rover(1, 1, 'E');

        assertEquals(new Rover(2, 1, 'E'), rover.navigateTo("M"));
    }

    @Test
    public void xCoordinateDecreasesFrom1TO0WhenRoverMovesInWest() {
        rover = new Rover(1, 1, 'W');

        assertEquals(new Rover(0, 1, 'W'), rover.navigateTo("M"));
    }
}