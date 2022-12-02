package com.afs.tdd;

import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        else if(command.equals("L")){
            turnLeft();
        }
        else if(command.equals("R")){
            turnRight();
        }
    }

    private void turnRight() {
        if(direction.equals("N")){
            direction="E";
        }
        else if(direction.equals("S")){
            direction="W";
        }
        else if(direction.equals("E")){
            direction="S";
        }
        else if(direction.equals("W")){
            direction="N";
        }
    }

    public void turnLeft(){
        if(direction.equals("N")){
            direction="W";
        }
        else  if(direction.equals("S")){
            direction="E";
        }
        else  if(direction.equals("E")){
            direction="N";
        }
        else  if(direction.equals("W")){
            direction="S";
        }
    }

    public void move(){
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

    public void excuteBatchCommand(String batchCommand) {
        Stream.of(batchCommand.split(""))
                .map (String::new)
                .forEach(this::excuteCommand);
    }

}
