package com.example.dicelib;

import java.util.ArrayList;

public class DiceGame {

    public static void main(String args[]){

        //创建dice
//        Dice d1 = new Dice();

        //测试random dice
//        System.out.println(d1.randomDice());
//        System.out.println(d1.randomDice());
//        System.out.println(d1.randomDice());
//        System.out.println(d1.randomDice());

        //______________________________________________________
        //_____________________________________________________
        //创建dice cup
        DiceCup dc1 = new DiceCup();

        //_____________________________________________________
        //确定骰子数量，按照数量加入dice Cup
        int diceNumber = 4;
        for(int i = 0; i < diceNumber; i++){
            dc1.addingDice();
        }
        //摇骰子
        dc1.shakeDiceCup();

        //获取cup里所有骰子的结果储存在resultList
        ArrayList<Integer> resultList = dc1.getResultList();

        //展示所有骰子的结果
        for (int a: resultList) {
            System.out.print(a + " ");
        }

    }

}