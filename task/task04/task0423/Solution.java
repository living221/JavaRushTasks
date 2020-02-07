package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
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
        String age = bufferedReader.readLine(); //читаем строку с клавиатуры
        int nAge = Integer.parseInt(age); //преобразовываем строку в число.

        if (nAge > 20) System.out.println("И 18-ти достаточно");
    }
}
