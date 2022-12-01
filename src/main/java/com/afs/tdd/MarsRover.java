package com.afs.tdd;

import java.util.List;

public class MarsRover {
    private int locationX;
    private int locationY;
    private Direction direction;

    public MarsRover(int locationX, int locationY, Direction direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeBatchCommands(List<Command> commands) {
        commands.forEach(this::executeCommands);
    }

    public void executeBatchCommands(Command command) {
        executeCommands(command);
    }

    public void executeCommands(Command command) {
        switch (command){
            case M: {
                moveForward();
                break;
            }
            case L: {
                turnLeft();
                break;
            }
            case R: {
                turnRight();
                break;
            }
        }
    }

    private void turnRight() {
        switch (direction){
            case N : {
                direction = Direction.E;
                break;
            }
            case S : {
                direction = Direction.W;
                break;
            }
            case E : {
                direction = Direction.S;
                break;
            }
            case W : {
                direction = Direction.N;
                break;
            }
        }
    }

    private void moveForward() {
        switch (direction){
            case N: {
                addLocationY();
                break;
            }
            case S: {
                minusLocationY();
                break;
            }
            case E: {
                addLocationX();
                break;
            }
            case W: {
                minusLocationX();
                break;
            }
        }
    }

    private void minusLocationX() {
        this.locationX--;
    }

    private void addLocationX() {
        this.locationX++;
    }

    private void minusLocationY() {
        this.locationY--;
    }

    private void turnLeft() {
        switch (direction){
            case N : {
                direction = Direction.W;
                break;
            }
            case S : {
                direction = Direction.E;
                break;
            }
            case E : {
                direction = Direction.N;
                break;
            }
            case W : {
                direction = Direction.S;
                break;
            }
        }
    }

    private void addLocationY() {
        this.locationY++;
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public Direction getDirection() {
        return this.direction;
    }
}
