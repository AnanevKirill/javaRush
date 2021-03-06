package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        Map<String,Integer> list = new HashMap<String, Integer>();
        list.put("January",1);
        list.put("February",2);
        list.put("March",3);
        list.put("April",4);
        list.put("May",5);
        list.put("June",6);
        list.put("July",7);
        list.put("August",8);
        list.put("September",9);
        list.put("October",10);
        list.put("November",11);
        list.put("December",12);

        for (Map.Entry<String,Integer> pair:list.entrySet()
             ) {
            if(pair.getKey().equals(s)){
                String key = pair.getKey();
                int numb = pair.getValue();
                System.out.println(key + " is the " + numb + " month");
            }
            
        }
        //напишите тут ваш код
    }
}
