package com.javarush.task.task07.task0702;

/* 
Массив из строчек в обратном порядке
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        for (int a = 0;a < 8;a++){
            array[a] = reader.readLine();
            //напишите тут ваш код
        }
        for (int b = 9; b>=0; b--){
            System.out.println(array[b]);
        }

    }
}