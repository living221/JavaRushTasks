package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        int m1=0, m2=0, m3=0;

        if (in1 >= in2 && in1 >= in3) {
            m1 = in1;
            if (in2 >= in3){
                m2 = in2;
                m3 = in3;
            }
            else {
                m2 = in3;
                m3 = in2;
            }
        }
        else if (in2 >= in1 && in2 >= in3) {
            m1 = in2;
            if (in1 >= in3){
                m2 = in1;
                m3 = in3;
            }
            else {
                m2 = in3;
                m3 = in1;
            }
        }
        else if (in3 >= in1 && in3 >= in2) {
            m1 = in3;
            if (in1 >= in2){
                m2 = in1;
                m3 = in2;
            }
            else {
                m2 = in2;
                m3 = in1;
            }
        }
        System.out.println(m1 + " " + m2 + " " + m3);

    }
}
