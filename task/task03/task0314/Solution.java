package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int a = 1;
        while (a <= 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i * a);
                System.out.print(" ");
            }
            System.out.println();
            a++;
        }

    }
}
