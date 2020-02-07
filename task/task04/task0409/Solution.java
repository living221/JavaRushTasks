package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        // напишите тут ваш код
        int d1 = a - 10;
        d1 = abs(d1);
        int d2 = b - 10;
        d2 = abs(d2);
        if (d1 < d2){
            System.out.println(a);
        }
        if (d1 > d2){
            System.out.println(b);
        }
        if (d1 == d2){
            System.out.println(a);
        }
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}