package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(reader.readLine());
        }
        int x = arrayList.get(0).length();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (x < arrayList.get(i + 1).length()) {
                x = x;
            } else if (x > arrayList.get(i + 1).length()) {
                x = arrayList.get(i + 1).length();
            }

        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() == x) {
                System.out.println(arrayList.get(i));
            }
        }

    }
}

