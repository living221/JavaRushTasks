package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
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

        String y = bufferedReader.readLine(); //читаем строку с клавиатуры
        int iy = Integer.parseInt(y); //преобразовываем строку в число.
        String m = bufferedReader.readLine(); //читаем строку с клавиатуры
        int im = Integer.parseInt(m); //преобразовываем строку в число.
        String d = bufferedReader.readLine(); //читаем строку с клавиатуры
        int id = Integer.parseInt(d); //преобразовываем строку в число.

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + id + "." + im + "." + iy);


    }
}
