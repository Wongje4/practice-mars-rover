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
    @Test
    void should_00E_when_executeCommand_given_00SL() {
        //given

        Position position = new Position(0, 0, "S");
        String command = "L";


        //when
        MarsRover marsRover = new MarsRover(position, command);
        marsRover.executeCommand(position, command);

        //then
        assertEquals(0, marsRover.getPosition().getX());
        assertEquals(0, marsRover.getPosition().getY());
        assertEquals("E", marsRover.getPosition().getDirection());
    }
    // 00SR -> 00W
    @Test
    void should_00W_when_executeCommand_given_00SR() {
        //given

        Position position = new Position(0, 0, "S");
        String command = "R";


        //when
        MarsRover marsRover = new MarsRover(position, command);
        marsRover.executeCommand(position, command);

        //then
        assertEquals(0, marsRover.getPosition().getX());
        assertEquals(0, marsRover.getPosition().getY());
        assertEquals("W", marsRover.getPosition().getDirection());
    }

    // 00EM -> 10E
    @Test
    void should_10E_when_executeCommand_given_00EM() {
        //given

        Position position = new Position(0, 0, "E");
        String command = "M";


        //when
        MarsRover marsRover = new MarsRover(position, command);
        marsRover.executeCommand(position, command);

        //then
        assertEquals(1, marsRover.getPosition().getX());
        assertEquals(0, marsRover.getPosition().getY());
        assertEquals("E", marsRover.getPosition().getDirection());
    }
    // 00EL -> 00N
    @Test
    void should_00N_when_executeCommand_given_00EL() {
        //given

        Position position = new Position(0, 0, "E");
        String command = "L";


        //when
        MarsRover marsRover = new MarsRover(position, command);
        marsRover.executeCommand(position, command);

        //then
        assertEquals(0, marsRover.getPosition().getX());
        assertEquals(0, marsRover.getPosition().getY());
        assertEquals("N", marsRover.getPosition().getDirection());
    }
    // 00ER -> 00S
    @Test
    void should_00S_when_executeCommand_given_00ER() {
        //given

        Position position = new Position(0, 0, "E");
        String command = "R";


        //when
        MarsRover marsRover = new MarsRover(position, command);
        marsRover.executeCommand(position, command);

        //then
        assertEquals(0, marsRover.getPosition().getX());
        assertEquals(0, marsRover.getPosition().getY());
        assertEquals("S", marsRover.getPosition().getDirection());
    }

    // 00WM -> -10W
    @Test
    void should__10W_when_executeCommand_given_00WM() {
        //given

        Position position = new Position(0, 0, "W");
        String command = "M";


        //when
        MarsRover marsRover = new MarsRover(position, command);
        marsRover.executeCommand(position, command);

        //then
        assertEquals(-1, marsRover.getPosition().getX());
        assertEquals(0, marsRover.getPosition().getY());
        assertEquals("W", marsRover.getPosition().getDirection());
    }
    // 00WL -> 00S
    @Test
    void should_00S_when_executeCommand_given_00WL() {
        //given

        Position position = new Position(0, 0, "W");
        String command = "L";


        //when
        MarsRover marsRover = new MarsRover(position, command);
        marsRover.executeCommand(position, command);

        //then
        assertEquals(0, marsRover.getPosition().getX());
        assertEquals(0, marsRover.getPosition().getY());
        assertEquals("S", marsRover.getPosition().getDirection());
    }
    // 00WR -> 00N
    @Test
    void should_00N_when_executeCommand_given_00WR() {
        //given

        Position position = new Position(0, 0, "W");
        String command = "R";


        //when
        MarsRover marsRover = new MarsRover(position, command);
        marsRover.executeCommand(position, command);

        //then
        assertEquals(0, marsRover.getPosition().getX());
        assertEquals(0, marsRover.getPosition().getY());
        assertEquals("N", marsRover.getPosition().getDirection());
    }


}
