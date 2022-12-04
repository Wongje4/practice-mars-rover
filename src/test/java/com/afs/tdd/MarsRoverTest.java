package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    // 00NM -> 01N
    @Test
    void should_01N_when_executeCommand_given_00NM() {
        //given

        Position position = new Position(0, 0, "N");
        String command = "M";


        //when
        MarsRover marsRover = new MarsRover(position, command);
        marsRover.executeCommand(position, command);

        //then
        assertEquals(0, marsRover.getPosition().getX());
        assertEquals(1, marsRover.getPosition().getY());
        assertEquals("N", marsRover.getPosition().getDirection());
    }
    // 00NL -> 00W
    @Test
    void should_00W_when_executeCommand_given_00NL() {
        //given

        Position position = new Position(0, 0, "N");
        String command = "L";


        //when
        MarsRover marsRover = new MarsRover(position, command);
        marsRover.executeCommand(position, command);

        //then
        assertEquals(0, marsRover.getPosition().getX());
        assertEquals(0, marsRover.getPosition().getY());
        assertEquals("W", marsRover.getPosition().getDirection());
    }
    // 00NR -> 00E
    @Test
    void should_00E_when_executeCommand_given_00NR() {
        //given

        Position position = new Position(0, 0, "N");
        String command = "R";


        //when
        MarsRover marsRover = new MarsRover(position, command);
        marsRover.executeCommand(position, command);

        //then
        assertEquals(0, marsRover.getPosition().getX());
        assertEquals(0, marsRover.getPosition().getY());
        assertEquals("E", marsRover.getPosition().getDirection());
    }

    // 00SM -> 0-1S
    @Test
    void should_0_1S_when_executeCommand_given_00SM() {
        //given

        Position position = new Position(0, 0, "S");
        String command = "M";


        //when
        MarsRover marsRover = new MarsRover(position, command);
        marsRover.executeCommand(position, command);

        //then
        assertEquals(0, marsRover.getPosition().getX());
        assertEquals(-1, marsRover.getPosition().getY());
        assertEquals("S", marsRover.getPosition().getDirection());
    }
    // 00SL -> 00E
    // 00SR -> 00W

    // 00EM -> 10E
    // 00EL -> 00N
    // 00ER -> 00S

    // 00WM -> -10W
    // 00WL -> 00S
    // 00WR -> 00N


}
