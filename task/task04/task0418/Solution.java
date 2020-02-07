package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
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

        if (in1 < in2) {
            System.out.println(in1);
        }
        else if (in1 >= in2) {
            System.out.println(in2);
        }


    }
}