package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int im1 = 0;
        int sum = 0;
        while (true) {
            String m = bufferedReader.readLine(); //читаем строку с клавиатуры
            im1 = Integer.parseInt(m); //преобразовываем строку в число.
            if (im1 ==  -1)
            break;
            sum = sum + im1;
        }

        sum = sum + im1;
        System.out.println(sum);


    }
}
