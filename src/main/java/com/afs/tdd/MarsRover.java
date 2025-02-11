package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private Position position;
    private String command;


    public MarsRover(Position position, String command) {
        this.position = position;
        this.command = command;
    }

    public void executeCommand(Position position, String command) {
        if (command.equals("M")){
            moverForward(position.getDirection());
        }
        if (command.equals("L")){
            turnLeft(position.getDirection());
        }
        if (command.equals("R")){
            turnRight(position.getDirection());
        }
        if (command.length()>1){
            multipleCommands(command);
        }
    }

    private void multipleCommands(String command) {
        Arrays.stream(command.split(""))
                .forEach( oneCommand ->
                executeCommand(getPosition(), oneCommand));
    }

    private void turnRight(String original_direction) {
        if (original_direction.equals("N")) {
            position.setDirection("E");
        }
        if (original_direction.equals("S")) {
            position.setDirection("W");
        }
        if (original_direction.equals("E")) {
            position.setDirection("S");
        }
        if (original_direction.equals("W")) {
            position.setDirection("N");
        }
    }

    private void turnLeft(String original_direction) {
        if (original_direction.equals("N")) {
            position.setDirection("W");
        }
        if (original_direction.equals("S")) {
            position.setDirection("E");
        }
        if (original_direction.equals("E")) {
            position.setDirection("N");
        }
        if (original_direction.equals("W")) {
            position.setDirection("S");
        }
    }

    private void moverForward(String original_direction) {
        if (original_direction.equals("N")) {
            position.setY(position.getY() + 1);
        }
        if (original_direction.equals("S")) {
            position.setY(position.getY() - 1);
        }
        if (original_direction.equals("E")) {
            position.setX(position.getX() + 1);
        }
        if (original_direction.equals("W")) {
            position.setX(position.getX() - 1);
        }

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
