package com.afs.tdd;

public class MarsRover {
    private int locationX = 0;
    private int locationY = 0;
    private char direction;

    public MarsRover(char direction){
        this.direction = direction;
    }
    public MarsRover(int locationX, int locationY, char direction){
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }
    public void executeBatchCommands(String command){

    }
    private void move(String command){

    }
    private String turnLeft(String direction){
        return "";
    }

    private String turnRight(String direction){
        return "";
    }

}
