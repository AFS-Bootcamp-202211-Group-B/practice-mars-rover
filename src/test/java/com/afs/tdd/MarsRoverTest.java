package com.afs.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MarsRoverTest {
    @Test
    void should_01N_given_init_00N_and_command_M() {
        MarsRover marsRover = new MarsRover("N");
        marsRover.executeCommand("M");
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_00W_given_init_00N_and_command_L() {
        MarsRover marsRover = new MarsRover("N");
        marsRover.executeCommand("L");
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }
}
