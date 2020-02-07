package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int a = 1;
        while (a < 11){
            int i = 1;
            while (i <11){
                System.out.print(i*a + " ");
                i++;
            }
            System.out.println();
            a++;
        }
    }
}
