package com.afs.tdd;

public class MarsRover {

    private int locationX;
    private int locationY;
    private String direction;

    private static final String EAST = "E";
    private static final String SOUTH = "S";
    private static final String WEST = "W";
    private static final String NORTH = "N";


    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public String getStatus() {
        return String.format("%s %s %s", this.locationX, this.locationY, this.direction);
    }

    public void executeCommond(char command){
        if (command == 'M') {
            moveForward();
        }
        else if (command == 'L') {
            moveLeft();
        }
        else if (command == 'R') {
            moveRight();
        }

}
    private void moveRight() {
        if(direction.equals(NORTH)){
            this.direction = EAST;
        }
        else if(direction.equals(SOUTH)){
            this.direction = WEST;
        }
        else if(direction.equals(EAST)){
            this.direction = SOUTH;
        }
        else if(direction.equals(WEST)){
            this.direction = NORTH;
        }
    }
    private void moveLeft() {
        if(direction.equals(NORTH)) {
            this.direction = WEST;
        }
        else if (direction.equals(SOUTH)) {
            this.direction = EAST;
        }
        else if (direction.equals(EAST)) {
            this.direction = NORTH;
        }
        else if (direction.equals(WEST)) {
            this.direction = SOUTH;
        }
    }

    private void moveForward() {
        if (this.direction == "E") {
            this.locationX++;
        }
        else if (this.direction == "S") {
            this.locationY--;
        }
        else if (this.direction == "W") {
            this.locationX--;
        }
        else if (this.direction == "N") {
            this.locationY++;
        }
    }

    public void executeBatchCommand(String commands) {
        for (char command : commands.toCharArray()){
            executeCommond(command);
        }
    }
}
