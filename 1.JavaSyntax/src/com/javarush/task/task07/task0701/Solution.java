package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] array = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }// создай и заполни массив
        return array;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int a=1; a< array.length;a++){
            if (array[a]>max)
                max=array[a];
        }
        // найди максимальное значение
        return max;
    }
}
