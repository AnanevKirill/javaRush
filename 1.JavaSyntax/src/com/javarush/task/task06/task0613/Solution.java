package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        //Cat cat1=new Cat();// Создай 10 котов
    Cat[] cats =new Cat[10];
    for(int i = 0; i<10; i++) {
    cats[i] =new Cat();
        }
        System.out.println(Cat.catCount);// Выведи значение переменной catCount
    }

    public static class Cat {
        static public int catCount;// Создай статическую переменную catCount

        public Cat() {
            catCount++;
        }

        // Создай конструктор
    }
}
