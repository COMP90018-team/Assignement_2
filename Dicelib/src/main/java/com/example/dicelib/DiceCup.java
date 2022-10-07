package com.example.dicelib;

// Package添加:
import java.util.ArrayList;

public class DiceCup {

    // Attributes
    public ArrayList<Dice> cup;
    public int numberOfDice;


    //______________________________________________________


    public DiceCup(){
        this.cup = new ArrayList<Dice>();
        this.numberOfDice = 0;
    }

    public void addingDice(){
        Dice d = new Dice();
        this.cup.add(d);
        this.numberOfDice++;
    }

    public void shakeDiceCup(){
        for (Dice d: cup) {
            d.randomDice();
        }
    }

    public ArrayList<Integer> getResultList() {
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        for(int i=0; i<this.numberOfDice; i++){
            Dice temDice = cup.get(i);
            resultList.add(temDice.getOnTop());
        }
        return resultList;
    }
}
