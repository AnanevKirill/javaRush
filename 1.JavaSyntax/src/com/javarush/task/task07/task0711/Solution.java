package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            array.add(reader.readLine());

        }
        for (int i = 0; i < 13; i++) {
            String s =array.get(4);
            array.remove(4);
            array.add(0,s);
           // array.add(0, array.remove(array.size()-1));
//            array.add(0, array.get(array.size()-1));
//            array.remove(array.size());
                 }
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));

        }
    }
}
