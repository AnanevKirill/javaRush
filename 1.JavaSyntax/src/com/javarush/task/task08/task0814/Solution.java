package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> list = new HashSet<Integer>();
        list.add(1);
        list.add(2);
        list.add(23);
        list.add(142);
        list.add(7);
        list.add(18);
        list.add(11);
        list.add(121);
        list.add(123);
        list.add(5);
        list.add(83);
        list.add(61);
        list.add(73);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(92);
        list.add(27);
        list.add(111);
        list.add(9);
        return list;
            }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> copyArray = new HashSet<Integer>(set);
        for(Integer s : copyArray){
            if(s > 10){
                set.remove(s); }
            copyArray = null;
        }
        return set;}


    public static void main(String[] args) {

    }
}
