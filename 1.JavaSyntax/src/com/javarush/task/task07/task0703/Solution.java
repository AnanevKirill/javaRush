package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arrays = new String[10];
        int[] arrayi = new int[10];
        for (int a = 0; a < 10; a++) {
            arrays[a] = reader.readLine();
            arrayi[a] = arrays[a].length();
            System.out.println(arrayi[a]);//напишите тут ваш код
        }
    }
}
