package com.javarush.task.task06.task0610;

/* 
Класс ConsoleReader
*/
import java.io.*;
public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;//напишите тут ваш код

    }

    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());//напишите тут ваш код
        return i;
    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(reader.readLine());//напишите тут ваш код
        return d;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        boolean b = Boolean.parseBoolean(reader.readLine());
        return b;
    }

    public static void main(String[] args) throws Exception {

    }
}
