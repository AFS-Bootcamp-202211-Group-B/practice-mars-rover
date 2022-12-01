package com.afs.tdd;

public class MarsRover {
    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x=x;
        this.y=y;
        this.direction=direction;
    }

    public void executeCommand(String command) {
        switch(command){
            case "M":
                move();
                break;
            case "L":
                turnLeft();
                break;
            case "R":
                break;
            default:
                break;
        }

    }

    private void turnLeft() {
        switch(this.direction){
            case "N":
                this.direction="W";
                break;
            case "E":
                this.direction="N";
                break;
            case "S":
                this.direction="E";
                break;
            case "W":
                this.direction="S";
                break;
            default:
                break;
        }
    }

    private void move() {
        switch(this.direction){
            case "N":
                y++;
                break;
            case "E":
                x++;
                break;
            case "S":
                y--;
                break;
            case "W":
                x--;
                break;
            default:
                break;
        }
    }

    public int getLocationX() {
        return this.x;
    }

    public int getLocationY() {
        return this.y;
    }

    public String getDirection() {
        return this.direction;
    }
}
