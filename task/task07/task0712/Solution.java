package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int strL = 0;
        int strS = 0;

        //ищем самую длинную строку
        ArrayList<String> list = new ArrayList<String>();
        String sMax = "";
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            if (s.length() > sMax.length()) {
                sMax = s;
            }
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            String j = list.get(i);
            if (sMax.length() == j.length()) {
                strL = i;
                break;
            }
        }

        //System.out.println(strL);


        //ищем самую короткую строку
        String sMin = list.get(0);
        int min = sMin.length();

        for (int i = 1; i < list.size(); i++){
            String j = list.get(i);
            if (j.length() <= min){
                min = j.length();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            String j = list.get(i);
            if (j.length() <= min) {
                strS = i;
                break;
            }
        }
        //System.out.println(strS);
        if (strL < strS){
            System.out.println(list.get(strL));
        }
        else System.out.println(list.get(strS));


    }
}
