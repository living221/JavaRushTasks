package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine(); //читаем строку с клавиатуры
        String money = bufferedReader.readLine(); //читаем строку с клавиатуры
        //int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.
        String years = bufferedReader.readLine(); //читаем строку с клавиатуры


        System.out.println(name + " получает " + money + " через " + years + " лет.");


    }
}
