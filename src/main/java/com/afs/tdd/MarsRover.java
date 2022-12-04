package com.afs.tdd;

public class MarsRover {
    private Position position;
    private String command;


    public MarsRover(Position position, String command) {
        this.position = position;
        this.command = command;
    }

    public void executeCommand(Position position, String command) {
        if (command.equals("M") && position.getDirection().equals("N")){
            moverForward();
        }
        if (command.equals("L")){
            turnLeft();
        }
        if (command.equals("R")){
            turnRight();
        }

    }

    private void turnRight() {
        position.setDirection("E");
    }

    private void turnLeft() {
        position.setDirection("W");
    }

    private void moverForward() {
        position.setY(position.getY()+1);
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
