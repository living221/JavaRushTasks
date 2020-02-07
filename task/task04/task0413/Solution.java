package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String nDay = bufferedReader.readLine(); //читаем строку с клавиатуры
        int intnDay = Integer.parseInt(nDay); //преобразовываем строку в число.

        if (intnDay >= 1 && intnDay <=7){
            if (intnDay == 1){
                System.out.println("понедельник");
            }
            if (intnDay == 2){
                System.out.println("вторник");
            }
            if (intnDay == 3){
                System.out.println("среда");
            }
            if (intnDay == 4){
                System.out.println("четверг");
            }
            if (intnDay == 5){
                System.out.println("пятница");
            }
            if (intnDay == 6){
                System.out.println("суббота");
            }
            if (intnDay == 7){
                System.out.println("воскресенье");
            }
        }
        else
            System.out.println("такого дня недели не существует");


    }
}