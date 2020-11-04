package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String string;
            while (true) {
                string = reader.readLine();
                list.add(Integer.parseInt(string));
            }
            //напишите тут ваш код

        } catch (Exception e
        ) {
            for (Integer x : list)
                System.out.println(x);
        }
    }
}
