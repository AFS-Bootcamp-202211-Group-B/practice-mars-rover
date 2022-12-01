package com.afs.tdd;

public class MarsRover {
    private final int locationX;
    private int locationY;
    private final String direction;

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeCommand(String command) {
        if(command.equals("M")){
            move();
        }
    }

    private void move() {
        if(direction.equals("N")) {
            locationY++;
        } else if (direction.equals("S")) {
            locationY--;
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
