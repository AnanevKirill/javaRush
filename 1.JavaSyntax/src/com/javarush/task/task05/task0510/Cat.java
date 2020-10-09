package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    public String name, address, color;
    public int weight, age;

    public void initialize(String name) {
        this.name = name;
        this.color = "color";
        this.age = 3;
        this.weight = 3;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "color";
    }


    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 3;
    }

    public void initialize(int weight, String color) {
        this.color = color;
        this.weight = weight;
        this.age = 2;
    }

    public void initialize(int weight,String color, String address) {
       this.address = address;
       this.color = color;
       this.weight = weight;
       this.age = 2;
    }


    //напишите тут ваш код

    public static void main(String[] args) {
    }
}

