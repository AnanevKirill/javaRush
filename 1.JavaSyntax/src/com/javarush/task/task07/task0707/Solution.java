package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("один");
        list.add("two");
        list.add("tri");
        list.add("4etire");
        list.add("pyat");
        System.out.println(list.size());
        for (int i=0;i<5;i++){
            System.out.println(list.get(i));//напишите тут ваш код
        }
    }
}
