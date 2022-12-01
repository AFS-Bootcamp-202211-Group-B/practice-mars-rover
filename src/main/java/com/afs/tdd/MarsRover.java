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

    public void executeCommand(String command) {
        if(command.equals("M")){
            move();
        }
        if(command.equals("L")){
            turnLeft();
        }
        if(command.equals("R")){
            turnRight();
        }
    }

    private void turnRight() {
        if(direction.equals("N")){
            setDirection("E");
        }
    }

    private void turnLeft() {
        if(direction.equals("N")){
            setDirection("W");
        } else if (direction.equals("S")) {
            setDirection("E");
        } else if (direction.equals("W")) {
            setDirection("S");
        } else if (direction.equals("E")) {
            setDirection("N");
        }
    }

    private void setDirection(String direction) {
        this.direction = direction;
    }

    private void move() {
        if(direction.equals("N")) {
            locationY++;
        } else if (direction.equals("S")) {
            locationY--;
        } else if (direction.equals("W")) {
            locationX--;
        } else if (direction.equals("E")) {
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
