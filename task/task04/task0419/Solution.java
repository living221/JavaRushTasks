package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
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
        String n4 = bufferedReader.readLine(); //читаем строку с клавиатуры
        int in4 = Integer.parseInt(n4); //преобразовываем строку в число.

        if (in1 > in2 && in1 > in3 && in1 > in4)
            System.out.println(in1);
        else if (in2 > in3 && in2 > in4)
            System.out.println(in2);
        else if (in3 > in4)
            System.out.println(in3);
        else System.out.println(in4);
    }
}
