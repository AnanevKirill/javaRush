package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list= new int[20];
        int maximum;
        int minimum;
        for (int i = 0; i < list.length; i++) {
            list [i]= Integer.parseInt(reader.readLine());
        }
        maximum=list[0];
        minimum=list[0];
        for (int i = 0; i < 19; i++) {
            if (list[i+1]>maximum) {
                maximum=list[i+1];
            }
            if (list[i+1]<minimum){
                minimum=list[i+1];
            }

        }

        System.out.print(maximum + " " + minimum);
    }
}
