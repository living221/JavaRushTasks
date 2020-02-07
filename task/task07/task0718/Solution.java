package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        int strMax = 0;
        int errInx = 0;

        for (int i = 0; i < 10; i++){
            String s = reader.readLine();
            //int tmp = Integer.parseInt(s);
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++){
            String s = list.get(i);
            if (s.length() >= strMax){
                strMax = s.length();
            }
            else {
                errInx = i;
                break;
            }
        }
        if (errInx != 0) {
            System.out.println(errInx);
        }
    }
}

