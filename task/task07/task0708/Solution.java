package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        strings = new ArrayList<String>();
        String sMax = "";
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            if (s.length() > sMax.length()){
                sMax = s;
            }
            strings.add(s);
        }

        for (int i = 0; i < strings.size(); i++) {
            String j = strings.get(i);
            if (sMax.length() == j.length()) {
                System.out.println(j);
            }
        }
    }
}
