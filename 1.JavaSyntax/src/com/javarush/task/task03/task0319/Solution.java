package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sAge = reader.readLine();
        String nUSD = reader.readLine();
        int nAge = Integer.parseInt(sAge);

        System.out.println(name + "  " + "получает " + nAge + " через " + nUSD + " лет.");
        //напишите тут ваш код

    }
}
