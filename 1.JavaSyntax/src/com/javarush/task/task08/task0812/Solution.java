package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>(10);
        int count = 1;
        int count1 = 1;
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(reader.readLine());
            list.add(num);//напишите тут ваш код
        }
        for (int i = 0, j = i + 1; i < list.size() & j < list.size(); i++, j++) {
            if (list.get(i).equals(list.get(j))) {
                count++;
            } else {
                if (count >= count1) {
                    count1 = count;
                }
                count = 1;
            }

        }
        System.out.println(Math.max(count, count1));
    }
}