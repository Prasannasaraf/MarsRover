package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoverTest {

    @Test
    public void positionAndDirectionDoesNotChangeWhenRoverTurnsLeftAndRight() {
        Rover rover = new Rover(1, 2, 'N');

        assertEquals(new Rover(1, 2, 'N'), rover.navigateTo("LR"));
    }
}