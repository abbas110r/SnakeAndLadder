package com.snakeAndLadders;
import java.lang.Math;
public class Dice {
    private static int min;
    private static int max;
    public static void setNoOfDIce(int n){
        min = n;
        max = 6*n;
    }
    public static int getMax(){
        return max;
    }
    public static int rollDice(){
        int range = max-min+1;
        int rand= (int)(Math.random()*range)+min;
        return rand;
    }
}