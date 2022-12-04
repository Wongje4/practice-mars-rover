package com.afs.tdd;

public class MarsRover {
    private Position position;
    private String command;


    public MarsRover(Position position, String command) {
        this.position = position;
        this.command = command;
    }

    public void executeCommand(Position position, String command) {

    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


    public void setCommand(String command) {
        this.command = command;
    }
}
