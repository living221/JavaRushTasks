package com.javarush.task.task03.task0320;

/* 
Скромность украшает программиста
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
        //int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.
        String name = bufferedReader.readLine(); //читаем строку с клавиатуры


        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");



    }
}
