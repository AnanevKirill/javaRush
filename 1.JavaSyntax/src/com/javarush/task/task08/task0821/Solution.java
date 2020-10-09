package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String,String> map = new HashMap<>();
        map.put("1", "s");
        map.put("2", "два");
        map.put("3", "два");
        map.put("4", "один");
        map.put("5", "й");
        map.put("6", "й");
        map.put("3", "пять");
        map.put("2", "й");
        map.put("9", "л");
        map.put("10", "s");//напишите тут ваш код

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
