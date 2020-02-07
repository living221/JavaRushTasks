package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(100, 75));
        System.out.println(convertEurToUsd(38, 65));

    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        double dlr = eur * course;
        return dlr;

    }
}
