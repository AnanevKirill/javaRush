package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println( convertEurToUsd(60,1.2));
        System.out.println( convertEurToUsd(70,1.3));
//return;
    }

    public static double convertEurToUsd(int eur, double course) {
       double usd=eur*course; //напишите тут ваш код
       // System.out.println(usd);
    return usd;
    }
}
