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
    @Test
    void should_return_0_0_E_when_executeCommand_given_0_0_N_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);
        //when
        marsRover.executeBatchCommands(Command.R);
        //then
        assertEquals(Direction.E, marsRover.getDirection());
    }
    @Test
    void should_return_0_negative1_S_when_executeCommand_given_0_0_S_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.S);
        //when
        marsRover.executeBatchCommands(Command.M);
        //then
        assertEquals(0xffffffff, marsRover.getLocationY());
    }
    @Test
    void should_return_0_0_E_when_executeCommand_given_0_0_S_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.S);
        //when
        marsRover.executeBatchCommands(Command.L);
        //then
        assertEquals(Direction.E, marsRover.getDirection());
    }
    @Test
    void should_return_0_0_W_when_executeCommand_given_0_0_S_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.S);
        //when
        marsRover.executeBatchCommands(Command.R);
        //then
        assertEquals(Direction.W, marsRover.getDirection());
    }
    @Test
    void should_return_1_0_E_when_executeCommand_given_0_0_E_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.E);
        //when
        marsRover.executeBatchCommands(Command.M);
        //then
        assertEquals(1, marsRover.getLocationX());
    }
    @Test
    void should_return_0_0_N_when_executeCommand_given_0_0_E_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.E);
        //when
        marsRover.executeBatchCommands(Command.L);
        //then
        assertEquals(Direction.N, marsRover.getDirection());
    }
    @Test
    void should_return_0_0_S_when_executeCommand_given_0_0_E_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.E);
        //when
        marsRover.executeBatchCommands(Command.R);
        //then
        assertEquals(Direction.S, marsRover.getDirection());
    }
    @Test
    void should_return_negative1_0_W_when_executeCommand_given_0_0_W_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.W);
        //when
        marsRover.executeBatchCommands(Command.M);
        //then
        assertEquals(0xffffffff, marsRover.getLocationX());
    }
    @Test
    void should_return_0_0_S_when_executeCommand_given_0_0_W_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, Direction.W);
        //when
        marsRover.executeBatchCommands(Command.L);
        //then
        assertEquals(Direction.S, marsRover.getDirection());
    }
}
