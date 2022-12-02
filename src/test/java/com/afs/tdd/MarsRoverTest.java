package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_go_to_0_1_N_when_execute_command_given_0_0_N_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "N");

        //when
        marsRover.excuteCommand("M");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_neg1_S_when_execute_command_given_0_0_S_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "S");

        //when
        marsRover.excuteCommand("M");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(-1, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_go_to_1_0_E_when_execute_command_given_0_0_E_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "E");

        //when
        marsRover.excuteCommand("M");

        //then
        assertEquals(1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_go_to_neg1_0_W_when_execute_command_given_0_0_W_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "W");

        //when
        marsRover.excuteCommand("M");

        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_W_when_execute_command_given_0_0_N_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "N");

        //when
        marsRover.excuteCommand("L");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }
    @Test
    void should_go_to_0_0_E_when_execute_command_given_0_0_S_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "S");

        //when
        marsRover.excuteCommand("L");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_N_when_execute_command_given_0_0_E_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "E");

        //when
        marsRover.excuteCommand("L");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_S_when_execute_command_given_0_0_W_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "W");

        //when
        marsRover.excuteCommand("L");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_E_when_execute_command_given_0_0_N_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "N");

        //when
        marsRover.excuteCommand("R");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_W_when_execute_command_given_0_0_S_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "S");

        //when
        marsRover.excuteCommand("R");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_S_when_execute_command_given_0_0_E_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "E");

        //when
        marsRover.excuteCommand("R");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_N_when_execute_command_given_0_0_W_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "W");

        //when
        marsRover.excuteCommand("R");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_go_to_1_2_N_when_execute_batchcommand_given_0_0_N_and_MRMLM() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "N");

        //when
        marsRover.excuteBatchCommand("MRMLM");

        //then
        assertEquals(1, marsRover.getLocationX());
        assertEquals(2, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }


}
