package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_return_0_1_N_when_executeCommand_given_0_0_N_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        //when
        marsRover.executeBatchCommands("M");
        //then
        assertEquals(1, marsRover.getLocationY());
    }
    
}
