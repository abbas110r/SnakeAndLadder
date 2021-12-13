package com.snakeAndLadders;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private  int end; /*Board Size */
    private  HashMap<Integer,Integer> snakePositions;  /* The start and end points of a snakes are stored as key : value pairs in this hashmap*/
    private  HashMap<Integer,Integer> ladderPositions; /* The start and end points of ladders are stored as key : value pairs in this hashmap*/
    public Board(int end){
        this.end =end;
        snakePositions = new HashMap<>();
        ladderPositions = new HashMap<>();
    }
    public void setSnakePositions(int startPosition,int endPosition){
        this.snakePositions.put(startPosition,endPosition);
    }
    public void setLadderPositions(int startPositon,int endPosition){
        this.ladderPositions.put(startPositon,endPosition);
    }
    public HashMap<Integer,Integer> getSnakes(){
        return snakePositions;
    }

    public HashMap<Integer,Integer> getLadders(){
        return ladderPositions;
    }
    public int getEnd(){
        return end;
    }



}
