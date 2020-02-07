package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }
        String sMin = list.get(0);
        int min = sMin.length();

        for (int i = 1; i < list.size(); i++){
            String j = list.get(i);
            if (j.length() <= min){
                min = j.length();
            }
        }

        for (int i = 0; i < list.size(); i++){
            String j = list.get(i);
            if (j.length() <= min){
                System.out.println(list.get(i));
            }
        }

    }
}
