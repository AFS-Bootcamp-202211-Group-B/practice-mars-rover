package com.afs.tdd;

import java.util.Arrays;

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
        Arrays.stream(command.split("")).forEach(cmd -> executeCommand(cmd));
    }

    public void executeCommand(String command) {
        switch (command) {
            case "M":
                move();
                break;
            case "L":
                turnLeft();
                break;
            case "R":
                turnRight();
                break;
            default:
                return;
        }
    }

    private void move() {
        switch (direction) {
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

    private void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "E":
                direction = "N";
                break;
            case "S":
                direction = "E";
                break;
            case "W":
                direction = "S";
                break;
            default:
                return;
        }
    }

    private void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
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
