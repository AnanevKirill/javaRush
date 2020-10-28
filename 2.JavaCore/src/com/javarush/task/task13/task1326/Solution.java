package com.javarush.task.task13.task1326;

import java.io.*;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> spisok = new ArrayList<>();
        BufferedReader readline = new BufferedReader(new InputStreamReader(System.in));
        String line = readline.readLine();
        FileInputStream readFile = new FileInputStream(line);
        Scanner buffer = new Scanner(readFile);
        while (buffer.hasNext()) {
            int numd = buffer.nextInt();
            if (numd % 2 == 0)
                spisok.add(numd);
        }
        Collections.sort(spisok);
        System.out.println(spisok);
        buffer.close();
        readFile.close();// напишите тут ваш код
    }
}
