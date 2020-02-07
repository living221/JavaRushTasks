package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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

        if (in1 == in2 && in1 == in3) {
            System.out.println(in1 + " " + in2 + " " + in3);
        }
        else if (in1 == in2){
            System.out.println(in1 + " " + in2);
        }
        else if (in2 == in3){
            System.out.println(in2 + " " + in3);
        }
        else if (in1 == in3){
            System.out.println(in1 + " " + in3);
        }
    }
}