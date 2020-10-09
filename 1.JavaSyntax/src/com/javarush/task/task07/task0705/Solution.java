package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array20 = new int[20];
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < array20.length; i++) {
            array20[i]=Integer.parseInt(reader.readLine());

        }
        for (int j = 0; j < array1.length; j++) {
            array1[j]=array20[j];

        }
        for (int k = 0; k < array2.length; k++) {
            array2[k]=array20[10+k];
            System.out.println(array2[k]);

        }
    }
}
