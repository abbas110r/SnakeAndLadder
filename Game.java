package com.snakeAndLadders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

public class Game  {
    private HashMap<Integer,Integer> snakePositions;
    private  HashMap<Integer,Integer> ladderPositions;
    private Queue<Player>nextTurn;
    private int boardSize;
    private HashMap<String ,Integer>currPostion;

    //    private int playUntil;
    public Game(Board b, Queue<Player> nextTurn,HashMap<String ,Integer>currPostion){
        this.ladderPositions = b.getLadders();
        this.snakePositions = b.getSnakes();
        this.nextTurn =nextTurn;
        this.boardSize =b.getEnd();
        this.currPostion = currPostion;

//        this.playUntil = playUntil;
    }

    public void start(){
        System.out.println("Welcome Players");
        for (Player p: nextTurn) {
            System.out.println(p);
        }

        while(nextTurn.size()>1){

            int diceOut = Dice.rollDice();
            System.out.println("Dice rolled "+diceOut);
            int count = 0;
            Player p;
            if(diceOut==Dice.getMax() && count<2){
                count++;
                 p = nextTurn.peek();

            }

            else{
                 p = nextTurn.poll();
                nextTurn.add(p);

            }
            if(currPostion.get(p.getName())+diceOut<boardSize){
                currPostion.put(p.getName(),currPostion.get(p.getName())+diceOut);
                if(snakePositions.containsKey(currPostion.get(p.getName()))){
                    System.out.println(p.getName()+" EATEN BY A SNAKE"+" at "+currPostion.get(p.getName()));
                    currPostion.put(p.getName(),snakePositions.get(currPostion.get(p.getName())));
                }
                if (ladderPositions.containsKey(currPostion.get(p.getName()))){
                    System.out.println(p.getName()+" CLIMBED A LADDER "+" at "+currPostion.get(p.getName()));
                    currPostion.put(p.getName(),ladderPositions.get(currPostion.get(p.getName())));

                }
                System.out.println(p.getName()+" is at "+currPostion.get(p.getName()));
            }
            if(currPostion.get(p.getName())+diceOut==boardSize){
                System.out.println(p.getName()+" has won");
                break;
            }
            if(currPostion.get(p.getName())+diceOut>boardSize){
                continue;
            }

        }

    }
}
