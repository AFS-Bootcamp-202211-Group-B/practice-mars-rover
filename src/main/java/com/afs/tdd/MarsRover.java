package com.afs.tdd;

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

    public void executeCommand(String command) {
        if(command.equals(MOVE)){
            move();
        }
        if(command.equals(LEFT)){
            turnLeft();
        }
        if(command.equals(RIGHT)){
            turnRight();
        }
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
