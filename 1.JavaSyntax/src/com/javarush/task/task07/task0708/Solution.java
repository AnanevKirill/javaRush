package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        for (int j = 0; j < 5; j++) {
            strings.add(reader.readLine());
            }
        int x = strings.get(0).length();
        for (int i = 0; i < strings.size()-1; i++) {
            if (strings.get(i).length()>strings.get(i+1).length()) {
                x = strings.get(i).length();
            }
            else if (strings.get(i).length()<strings.get(i+1).length()) {
                x = strings.get(i+1).length();
            }

        }
        for (int i = 0; i < strings.size(); i++) {
            if (x==strings.get(i).length()) {
                System.out.println(strings.get(i));
            }

        }






//        for (int i = 0; i < strings.size(); i++) {
//           // for (int i1 = 0; i1 < strings.size()-1-i; i1++) {
//                String c = strings.get(i);
//                String b = strings.get(i+1);
//                int element1 = strings.get(i).length();
//                int element2 = strings.get(i+1).length();
//                if (element1<element2) {
//                    strings.set(i) = b;
//                    strings.set(i+1)= c;
//
//                }
//
//            }

        }
    }

