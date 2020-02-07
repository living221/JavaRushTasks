package com.javarush.task.task05.task0507;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int count = 0;
        double avg = 0;
        int sum = 0;

        while (true) {
            InputStream inputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String n = bufferedReader.readLine(); //читаем строку с клавиатуры
            int in = Integer.parseInt(n); //преобразовываем строку в число.

            if (in == -1)
            break;

            count++;
            sum += in;
        }
        double dsum = sum;
        double dcount = count;
        avg = dsum / dcount;
        //System.out.println(sum + " " + count);
        System.out.println(avg);
    }
}

