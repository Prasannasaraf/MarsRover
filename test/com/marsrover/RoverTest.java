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
}