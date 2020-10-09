package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            array.add(reader.readLine());

        }
        int min = array.get(0).length();
        for (int i = 0; i < array.size() - 1; i++) {
            if (min < array.get(i + 1).length()) {
                min = min;
            } else if (min > array.get(i + 1).length()) {
                min = array.get(i + 1).length();
            }
        }
        int max = array.get(0).length();
        for (int i = 0; i < array.size() - 1; i++) {
            if (max > array.get(i + 1).length()) {
                max = max;
            } else if (max < array.get(i + 1).length()) {
                max = array.get(i + 1).length();
            }

        }
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).length() == min || array.get(i).length() == max) {
                System.out.println(array.get(i));
                break;
            }

        }
    }
}