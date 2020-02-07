package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        int y = 2; int m = 1;
        System.out.println(m);
        int a = 1;
        while (a < 500) {
            m = y + m;
            System.out.println(m);
            y++;
            a++;
        }
    }
}
