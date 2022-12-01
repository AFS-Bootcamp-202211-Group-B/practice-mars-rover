package com.afs.tdd;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeBatchCommands(String command) {
        switch (command){
            case "M": {
                moveForward(locationX, locationY, direction);
                break;
            }
        }
    }

    private void moveForward(int locationX, int locationY, String direction) {
        switch (direction){
            case "N": {
                addLocationY();
                break;
            }
        }
    }
    private void addLocationY() {
        this.locationY++;
    }

    public int getLocationX() {
        return 0;
    }

    public int getLocationY() {
        return locationY;
    }
}
