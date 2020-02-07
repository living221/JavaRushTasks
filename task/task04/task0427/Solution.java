package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String n1 = bufferedReader.readLine(); //читаем строку с клавиатуры
        int in1 = Integer.parseInt(n1); //преобразовываем строку в число.

        if (in1 >= 1 && in1 <=9 && in1 % 2 == 0) System.out.println("четное однозначное число");
        else if (in1 >= 0 && in1 <=9 && in1 % 2 != 0) System.out.println("нечетное однозначное число");
        else if (in1 >= 10 && in1 <=99 && in1 % 2 == 0) System.out.println("четное двузначное число");
        else if (in1 >= 10 && in1 <=99 && in1 % 2 != 0) System.out.println("нечетное двузначное число");
        else if (in1 >= 100 && in1 <=999 && in1 % 2 == 0) System.out.println("четное трехзначное число");
        else if (in1 >= 100 && in1 <=999 && in1 % 2 != 0) System.out.println("нечетное трехзначное число");

    }
}
