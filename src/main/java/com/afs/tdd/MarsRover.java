package com.afs.tdd;

public class MarsRover {
    private int locationX;
    private int locationY;
    private Direction direction;

    public MarsRover(int locationX, int locationY, Direction direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeBatchCommands(Command command) {
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
        }
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
