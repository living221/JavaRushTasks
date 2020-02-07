package com.javarush.task.task04.task0439;

/* 
Письмо счастья
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

        for (int i = 0; i < 10; i++){
            System.out.println(m + " любит меня.");
        }

    }
}
