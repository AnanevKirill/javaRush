package com.javarush.task.task05.task0529;

/* 
Консоль-копилка
*/
import org.w3c.dom.ls.LSOutput;

import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true) {
           String s = reader.readLine();
            if (!s.equals("сумма")){
            int a = Integer.parseInt(s);
            sum = sum + a;
            }
            else
                break;
            }
        System.out.println(sum);
        }
//       System.out.println(sum);
        //напишите тут ваш код
    }

