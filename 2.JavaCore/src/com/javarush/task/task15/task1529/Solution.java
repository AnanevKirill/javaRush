package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
       reset();
        //add your code here - добавьте код тут
    }

    public static CanFly result;

    public static void reset() {BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String stroka = reader.readLine();
            if("helicopter".equals(stroka)){
                result = new Helicopter();
            }
            else if ("plane".equals(stroka)){
                stroka=reader.readLine();
                result=new Plane(Integer.parseInt(stroka));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //add your code here - добавьте код тут
    }
}
