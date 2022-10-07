package com.example.dicelib;
import java.util.Random;

public class Dice {

    // Attributes
    public int onTop;

    //________________________________________________________

    /*
        Constructor
    */
    public Dice() {
        this.randomDice();
    }

    public int randomDice(){
        Random random = new Random();
        this.onTop = random.nextInt(6) + 1;
        return this.onTop;
    }

    public int getOnTop() {
        return onTop;
    }
}
