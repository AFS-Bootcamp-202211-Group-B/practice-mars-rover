package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    protected static final String MOVE = "M";
    protected static final String LEFT = "L";
    protected static final String RIGHT = "R";
    protected static final String NORTH = "N";
    protected static final String EAST = "E";
    protected static final String SOUTH = "S";
    protected static final String WEST = "W";
    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeBatchCommand(String command) {
        List<String> splitCommands = Arrays.asList(command.split(""));
        splitCommands.stream().forEach(splitCommand -> {
            if(splitCommand.equals(MOVE)){
                move();
            }
            else if(splitCommand.equals(LEFT)){
                turnLeft();
            }
            else if(splitCommand.equals(RIGHT)) {
                turnRight();
            }
        });
    }

    private void turnRight() {
        if(direction.equals(NORTH)){
            setDirection(EAST);
        } else if (direction.equals(SOUTH)) {
            setDirection(WEST);
        } else if (direction.equals(WEST)) {
            setDirection(NORTH);
        } else if (direction.equals(EAST)) {
            setDirection(SOUTH);
        }
    }

    private void turnLeft() {
        if(direction.equals(NORTH)){
            setDirection(WEST);
        } else if (direction.equals(SOUTH)) {
            setDirection(EAST);
        } else if (direction.equals(WEST)) {
            setDirection(SOUTH);
        } else if (direction.equals(EAST)) {
            setDirection(NORTH);
        }
    }

    private void setDirection(String direction) {
        this.direction = direction;
    }

    private void move() {
        if(direction.equals(NORTH)) {
            locationY++;
        } else if (direction.equals(SOUTH)) {
            locationY--;
        } else if (direction.equals(WEST)) {
            locationX--;
        } else if (direction.equals(EAST)) {
            locationX++;
        }
    }

    protected int getLocationX() {
        return locationX;
    }

    protected int getLocationY() {
        return locationY;
    }

    protected String getDirection() {
        return direction;
    }
}
