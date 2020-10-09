package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Лычкин", "Павел");
        map.put("Динара", "Альгужина");
        map.put("Хмелев", "Сергей");
        map.put("Лысенков", "Илья");
        map.put("Козлов", "Алекснадр");
        map.put("Никифоров", "Илья");
        map.put("Петасова", "Ангелина");
        map.put("Коваленко", "Николай");
        map.put("Соловьев", "Иван");
        map.put("Ибрагимов", "Ролан");
        return map;
        //напишите тут ваш код

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int x = 0;
        for (Map.Entry<String, String> pair : map.entrySet()
        ) {
            if (pair.getValue().equals(name)) {
                x++;
            }
        }
        return x;
    }//напишите тут ваш код


    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int y = 0;
        for (Map.Entry<String, String> pair : map.entrySet()
        ) {
            if (pair.getKey().equals(lastName)) {
                y++;
            }

        }//напишите тут ваш код
        return y;
    }

    public static void main(String[] args) {

    }
}
