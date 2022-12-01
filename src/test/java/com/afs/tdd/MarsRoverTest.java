package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_return_0_1_N_when_executeCommand_given_0_0_N_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);
        //when
        marsRover.executeBatchCommands(Command.M);
        //then
        assertEquals(1, marsRover.getLocationY());
    }

    @Test
    void should_return_0_0_W_when_executeCommand_given_0_0_N_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);
        //when
        marsRover.executeBatchCommands(Command.L);
        //then
        assertEquals(Direction.W, marsRover.getDirection());
    }
    
}
