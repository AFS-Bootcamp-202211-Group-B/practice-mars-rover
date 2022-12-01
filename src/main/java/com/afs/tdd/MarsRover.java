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
        switch (command) {
            case "N":
                locationY += 1;
                break;
            case "E":
                locationX += 1;
                break;
            case "S":
                locationY -= 1;
                break;
            case "W":
                locationX -= 1;
                break;
            default:
                return;
        }
    }

    private void turnLeft(String direction) {
        switch (direction) {
            case "N":
                this.direction = "W";
                break;
            case "E":
                this.direction = "N";
                break;
            case "S":
                this.direction = "E";
                break;
            case "W":
                this.direction = "S";
                break;
            default:
                return;
        }
    }

    private void turnRight(String direction) {
        switch (direction) {
            case "N":
                this.direction = "E";
                break;
            case "E":
                this.direction = "S";
                break;
            case "S":
                this.direction = "W";
                break;
            case "W":
                this.direction = "N";
                break;
            default:
                return;
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
