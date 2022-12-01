package com.afs.tdd;

public class MarsRover {
    private int locationX = 0;
    private int locationY = 0;
    private String direction;

    public MarsRover(String direction) {
        this.direction = direction;
    }

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeBatchCommands(String command) {

    }

    public void executeCommand(String command) {

    }

    private void move(String command) {

    }

    private String turnLeft(String direction) {
        return "";
    }

    private String turnRight(String direction) {
        return "";
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
