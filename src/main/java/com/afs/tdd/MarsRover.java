package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.move;

public class MarsRover {
    public static final String MOVE = "M";
    public static final String LEFT = "L";
    public static final String RIGHT = "R";
    public static final String NORTH = "N";
    public static final String EAST = "E";
    public static final String SOUTH = "S";
    public static final String WEST = "W";
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

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getDirection() {
        return direction;
    }
}
