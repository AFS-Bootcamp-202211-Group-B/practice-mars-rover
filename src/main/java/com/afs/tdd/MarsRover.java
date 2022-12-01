package com.afs.tdd;

public class MarsRover {

    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction){
        this.locationX= locationX;
        this.locationY=locationY;
        this.direction=direction;
    }

    public void excuteCommand(String command){
        if(command.equals("M")){
            move();
        }
    }

    private void move(){
        if(direction.equals("N")){
            locationY++;
        }
        else if(direction.equals("S")){
            locationY--;
        }
        else if(direction.equals("E")){
            locationX++;
        }
        else if(direction.equals("W")){
            locationX--;
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
