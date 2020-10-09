package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        int i = traceElements.length;
        System.out.println(i);
        return i;//напишите тут ваш код
    }
}

