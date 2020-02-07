package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
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
        String n2 = bufferedReader.readLine(); //читаем строку с клавиатуры
        int in2 = Integer.parseInt(n2); //преобразовываем строку в число.
        String n3 = bufferedReader.readLine(); //читаем строку с клавиатуры
        int in3 = Integer.parseInt(n3); //преобразовываем строку в число.

        int plusCount = 0;
        int minusCount = 0;

        if (in1 > 0) plusCount++;
        if (in1 < 0) minusCount++;

        if (in2 > 0) plusCount++;
        if (in2 < 0) minusCount++;

        if (in3 > 0) plusCount++;
        if (in3 < 0) minusCount++;


        System.out.println("количество положительных чисел: " + plusCount);
        System.out.println("количество отрицательных чисел: " + minusCount);

    }
}
