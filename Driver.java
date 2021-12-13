package com.snakeAndLadders;
import java.util.*;

public class Driver {
    public static void main(String args[]){
        Board b = new Board(100);
        b.setLadderPositions(1,38);
        b.setLadderPositions(4,14);
        b.setLadderPositions(8,20);
        b.setLadderPositions(21,42);
//        b.setLadderPositions(28,76);
        b.setSnakePositions(36,6);
//        b.setSnakePositions(62,18);
        Player p1 = new Player(1,"Raza Abbas");
        Player p2 = new Player(2,"Lokesh Polisetti");
        Player p3 = new Player(3,"Praneeth");
        Queue<Player> allPlayers = new LinkedList<>();
        allPlayers.offer(p1);
        allPlayers.offer(p2);
        allPlayers.offer(p3);
        HashMap<String,Integer>currPositions = new HashMap<>();
        currPositions.put(p1.getName(),0);
        currPositions.put(p2.getName(),0);
        currPositions.put(p3.getName(),0);
        Game g = new Game(b,allPlayers,currPositions);
        Dice.setNoOfDIce(1);
        g.start();

    }
}
