package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String nYear = bufferedReader.readLine(); //читаем строку с клавиатуры
        int intnYear = Integer.parseInt(nYear); //преобразовываем строку в число.

        if (intnYear % 400 == 0) {
            System.out.println("количество дней в году: 366");
        }
        else if (intnYear % 100 == 0) {
            System.out.println("количество дней в году: 365");
        }
        else if (intnYear % 4 == 0) {
            System.out.println("количество дней в году: 366");
        }
        else
            System.out.println("количество дней в году: 365");
     }
}