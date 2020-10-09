package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg one = new Zerg();
        one.name = "One";
        Zerg two = new Zerg();
        two.name = "Two";
        Zerg three = new Zerg();
        three.name = "Three";
        Zerg four = new Zerg();
        four.name = "Four";
        Zerg five = new Zerg();
        five.name = "Five";
        Protoss six = new Protoss();
        six.name = "Six";
        Protoss seven = new Protoss();
        seven.name = "Seven";
        Protoss eight = new Protoss();
        eight.name = "Eight";
        Terran nine = new Terran();
        nine.name = "Nane";
        Terran ten = new Terran();
        ten.name = "Ten";
        Terran eleven = new Terran();
        eleven.name = "Eleven";
        Terran twelve = new Terran();
        twelve.name = "Twelve"; //напишите тут ваш код

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
