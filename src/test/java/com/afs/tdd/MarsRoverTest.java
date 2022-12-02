package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    //00NM -< 01N
    @Test
    void should_go_to_0_1_N_when_execute_command_given_0_0_N_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "N");
        //when
        marsRover.executeCommond('M');
        //then
        assertEquals("0 1 N",marsRover.getStatus());

    }
    //00EM -< 10E
    @Test
    void should_go_to_1_0_E_when_execute_command_given_0_0_E_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "E");
        //when
        marsRover.executeCommond('M');
        //then
        assertEquals("1 0 E",marsRover.getStatus());
    }

    //00SM -< 0-1S
    @Test
    void should_go_to_0__1_S_when_execute_command_given_0_0_S_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "S");
        //when
        marsRover.executeCommond('M');
        //then
        assertEquals("0 -1 S",marsRover.getStatus());
    }
    //00WM -> -10W
    @Test
    void should_go_to__1_0_W_when_execute_command_given_0_0_W_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "W");
        //when
        marsRover.executeCommond('M');
        //then
        assertEquals("-1 0 W",marsRover.getStatus());
    }
    @Test
    void should_go_to_0_0_W_when_execute_command_given_0_0_N_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "N");
        //when
        marsRover.executeCommond('L');
        //then
        assertEquals("0 0 W",marsRover.getStatus());
    }

    @Test
    void should_go_to_0_0_N_when_execute_command_given_0_0_E_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "E");
        //when
        marsRover.executeCommond('L');
        //then
        assertEquals("0 0 N",marsRover.getStatus());
    }

    @Test
    void should_go_to_0_0_E_when_execute_command_given_0_0_S_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "S");
        //when
        marsRover.executeCommond('L');
        //then
        assertEquals("0 0 E",marsRover.getStatus());
    }

    @Test
    void should_go_to_0_0_S_when_execute_command_given_0_0_W_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "W");
        //when
        marsRover.executeCommond('L');
        //then
        assertEquals("0 0 S",marsRover.getStatus());
    }

    @Test
    void should_go_to_0_0_E_when_execute_command_given_0_0_N_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "N");
        //when
        marsRover.executeCommond('R');
        //then
        assertEquals("0 0 E",marsRover.getStatus());
    }

    @Test
    void should_go_to_0_0_S_when_execute_command_given_0_0_E_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "E");
        //when
        marsRover.executeCommond('R');
        //then
        assertEquals("0 0 S",marsRover.getStatus());
    }

    @Test
    void should_go_to_0_0_W_when_execute_command_given_0_0_S_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "S");
        //when
        marsRover.executeCommond('R');
        //then
        assertEquals("0 0 W",marsRover.getStatus());
    }

    @Test
    void should_go_to_0_0_N_when_execute_command_given_0_0_W_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "W");
        //when
        marsRover.executeCommond('R');
        //then
        assertEquals("0 0 N",marsRover.getStatus());
    }
    @Test
    void should_go___1_1_N_when_execute_BatchCommand_MLMR(){
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        String Commands = "MLMR";

        //when
        marsRover.executeBatchCommand(Commands);
        String result = marsRover.getStatus();

        //then
        assertEquals("-1 1 N", result);
    }
    @Test
    void should_go_0_0_N_when_execute_BatchCommand_MRRMRR(){
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        String Commands = "MRRMRR";

        //when
        marsRover.executeBatchCommand(Commands);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 0 N", result);
    }
    @Test
    void should_go_0__14_s_when_execute_BatchCommand_R_R_R_R_L_L_L_L_R_R_R_R_L_L_L_L_R_R_R_R_L_L_L_L_M_M_L_L_M_M_L_L_M_M_L_L_L_L_M_M_R_R_M_M_R_R_R_L_L_L_M_M_M_M_L_R_M_M_M_M_M_M_M_M_M_M_M_M(){
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        String Commands = "RRRRLLLLRRRRLLLLRRRRLLLLMMLLMMLLMMLLLLMMRRMMRRRLLLMMMMLRMMMMMMMMMMMM";

        //when
        marsRover.executeBatchCommand(Commands);
        String result = marsRover.getStatus();

        //then
        assertEquals("0 -14 S", result);
    }
}
