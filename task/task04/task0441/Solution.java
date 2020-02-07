package com.javarush.task.task04.task0441;

/* 
Как-то средненько
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
        int im1 = Integer.parseInt(m); //преобразовываем строку в число.
        String m2 = bufferedReader.readLine(); //читаем строку с клавиатуры
        int im2 = Integer.parseInt(m2); //преобразовываем строку в число.
        String m3 = bufferedReader.readLine(); //читаем строку с клавиатуры
        int im3 = Integer.parseInt(m3); //преобразовываем строку в число.

        int avg = 0;

        if (im1 <= im2 && im1 >= im3 || im1 >= im2 && im1 <= im3) {
            System.out.println(im1);
        }

        else if (im2 <= im1 && im2 >= im3 || im2 >= im1 && im2 <= im3) {
            System.out.println(im2);
        }

        else if (im3 <= im1 && im3 >= im2 || im3 >= im1 && im3 <= im2) {
            System.out.println(im3);
        }

    }
}
