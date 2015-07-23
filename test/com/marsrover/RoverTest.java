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

}