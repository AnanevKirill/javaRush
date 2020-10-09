package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "s");
        map.put("2", "два");
        map.put("3", "два");
        map.put("4", "один");
        map.put("5", "й");
        map.put("6", "й");
        map.put("7", "пять");
        map.put("8", "й");
        map.put("9", "л");
        map.put("10", "s");
        return map; //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        List<String> result = new ArrayList<>(map.values());

        for (int i = 0; i < result.size(); i++) {

            for (int j = i+1; j < result.size(); j++) {
                if (result.get(i).equals(result.get(j))){

                    removeItemFromMapByValue(map, result.get(i));
                }
            }

        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());

    }
}
