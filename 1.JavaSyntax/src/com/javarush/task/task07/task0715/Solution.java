package com.javarush.task.task07.task0715;

/*
Продолжаем мыть раму
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        for (int i = 0; i < list.size(); i++) {
            list.add(i=i + 1, "именно");

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }


        //напишите тут ваш код
    }
}
