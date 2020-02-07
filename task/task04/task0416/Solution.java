package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String st = bufferedReader.readLine(); //читаем строку с клавиатуры
        double dst = Double.parseDouble(st); //преобразовываем строку в число.

        //System.out.println(dst);
        //if (dst >= 0 && dst < 3 || dst >= 5 && dst < 8 || dst >= 10 && dst < 13 || dst >= 15 && dst < 18 || dst >= 20 && dst < 23 || dst >= 25 && dst < 28 || dst >= 30 && dst < 33 || dst >= 35 && dst < 38 || dst >= 40 && dst < 43 || dst >= 45 && dst < 48 || dst >= 50 && dst < 53 || dst >= 55 && dst < 58 ) {
        //    System.out.println("зелёный");
        //}
        //else if (dst >= 3 && dst < 4 || dst >= 8 && dst < 9 || dst >= 13 && dst < 14 || dst >= 18 && dst < 19 || dst >= 23 && dst < 24 || dst >= 28 && dst < 29 || dst >= 33 && dst < 34 || dst >= 38 && dst < 39 || dst >= 43 && dst < 44 || dst >= 48 && dst < 49 || dst >= 53 && dst < 54 || dst >= 58 && dst < 59 ) {
        //    System.out.println("жёлтый");
        //}
        //else
        //    System.out.println("красный");
        double t = dst % 5;
        if (t < 3) {
            System.out.println("зелёный");
        }
        else if (t >= 3 && t < 4) {
            System.out.println("жёлтый");
        }
        else {
            System.out.println("красный");
        }
    }
}