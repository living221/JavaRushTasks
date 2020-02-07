package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String n1Side = bufferedReader.readLine(); //читаем строку с клавиатуры
        int in1Side = Integer.parseInt(n1Side); //преобразовываем строку в число.
        String n2Side = bufferedReader.readLine(); //читаем строку с клавиатуры
        int in2Side = Integer.parseInt(n2Side); //преобразовываем строку в число.
        String n3Side = bufferedReader.readLine(); //читаем строку с клавиатуры
        int in3Side = Integer.parseInt(n3Side); //преобразовываем строку в число.

        //System.out.println(in1Side + in2Side + in3Side);
        if (in1Side + in2Side <= in3Side || in1Side + in3Side <= in2Side || in2Side + in3Side <= in1Side){
            System.out.println("Треугольник не существует.");
        }
        else
            System.out.println("Треугольник существует.");
    }
}