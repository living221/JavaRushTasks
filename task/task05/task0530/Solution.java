package com.javarush.task.task05.task0530;

import java.io.*;

/* 
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int a = reader.readLine();
        String s = reader.readLine();
        int a = Integer.parseInt(s); //преобразовываем строку в число.
        String s1 = reader.readLine();
        //int b = reader.read();
        int b  = Integer.parseInt(s1);

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
