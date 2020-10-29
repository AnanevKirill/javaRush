package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> sort = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream spisok = new FileInputStream(filename);
        BufferedReader fileReader =new BufferedReader(new InputStreamReader(spisok));
        String strokaFile = fileReader.readLine();
        while (strokaFile!=null){
            int x =Integer.parseInt(strokaFile);
            if (x%2==0){
                sort.add(x);

            }
            strokaFile = fileReader.readLine();
        }
        Collections.sort(sort);
        for (Integer integer : sort) {
            System.out.println(integer);
        }
        reader.close();
        fileReader.close();
        // напишите тут ваш код
    }
}
