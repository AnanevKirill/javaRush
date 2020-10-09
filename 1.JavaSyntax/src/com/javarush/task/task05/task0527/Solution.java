package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", 33,4);
        Dog dogDog = new Dog("dog", 23, 3);
        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
public static class Cat {
        String name;
        int height;
        int tale;

    public Cat(String name, int height, int tale) {
        this.name = name;
        this.height = height;
        this.tale = tale;
    }
}
public static class Dog {
    String name;
    int height;
    int tale;

    public Dog(String name, int height, int tale) {
        this.name = name;
        this.height = height;
        this.tale = tale;
    }
}
    //напишите тут ваш код
}
