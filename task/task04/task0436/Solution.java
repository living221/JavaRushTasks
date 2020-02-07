package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String m = bufferedReader.readLine(); //читаем строку с клавиатуры
        int m1 = Integer.parseInt(m); //преобразовываем строку в число.
        String n = bufferedReader.readLine(); //читаем строку с клавиатуры
        int n1 = Integer.parseInt(n); //преобразовываем строку в число.

        for (int i = 0; i < m1; i++){
            for (int a = 0; a < n1; a++){
                System.out.print(8);
            }
            System.out.println();
        }


    }
}
