package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        int p = a + b;//напишите тут ваш код
        return p;
    }

    public static int minus(int a, int b) {
        int m = a - b;//напишите тут ваш код
        return m;
    }

    public static int multiply(int a, int b) {
        int mu = a*b;//напишите тут ваш код
        return mu;
    }

    public static double division(int a, int b) {
//        double d = a/b;//напишите тут ваш код
        return (double) a/b;
    }

    public static double percent(int a, int b) {
//        double a = in
//        double p = a*(b/100);//напишите тут ваш код
        return (double) b*a/100.0;
    }

    public static void main(String[] args) {

    }
}