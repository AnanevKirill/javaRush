package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> listAll = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));

        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                list3.add(list.get(i));
               // list.remove(i);
            }
            if (list.get(i) % 2 == 0) {
                list2.add(list.get(i));
                //list.remove(i);
            }
            if (list.get(i) % 2 != 0 & list.get(i) % 3 != 0) {
                listAll.add(list.get(i));
            }

        }
        printList(list3);
        printList(list2);
        printList(listAll);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i : list) {
            System.out.println(i);
        }
        //напишите тут ваш код
    }
}
