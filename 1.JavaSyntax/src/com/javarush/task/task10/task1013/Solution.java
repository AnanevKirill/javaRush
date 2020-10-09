package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String FirstName;
        private String SecondName;
        private String work;
        private Integer age;
        private Integer rost;
        private Integer wes;

        public Human(String firstName) {
            FirstName = firstName;
        }

        public Human(String firstName, String secondName) {
            FirstName = firstName;
            SecondName = secondName;
        }

        public Human(String firstName, String secondName, String work) {
            FirstName = firstName;
            SecondName = secondName;
            this.work = work;
        }

        public Human(String work, Integer age) {
            this.work = work;
            this.age = age;
        }

        public Human(String firstName, String secondName, Integer age) {
            FirstName = firstName;
            SecondName = secondName;
            this.age = age;
        }

        public Human(String firstName, Integer age, Integer rost) {
            FirstName = firstName;
            this.age = age;
            this.rost = rost;
        }

        public Human(String firstName, String secondName, String work, Integer age) {
            FirstName = firstName;
            SecondName = secondName;
            this.work = work;
            this.age = age;
        }

        public Human(Integer age, Integer rost) {
            this.age = age;
            this.rost = rost;
        }

        public Human(Integer age, Integer rost, Integer wes) {
            this.age = age;
            this.rost = rost;
            this.wes = wes;
        }

        public Human(String firstName, String secondName, Integer age, Integer rost, Integer wes) {
            FirstName = firstName;
            SecondName = secondName;
            this.age = age;
            this.rost = rost;
            this.wes = wes;
        }
        // Напишите тут ваши переменные и конструкторы
    }
}
