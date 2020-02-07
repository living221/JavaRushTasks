package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigList = new int[20];

        for (int i = 0; i < bigList.length; i++)
        {
            String s = reader.readLine();
            bigList[i] = Integer.parseInt(s);
        }

        int[] smallList1 = new int[10];
        int[] smallList2 = new int[10];

        for (int i = 0; i < bigList.length/2; i++)
        {
            smallList1[i] = bigList[i];
        }

        for (int i = 0; i < bigList.length/2; i++)
        {
            smallList2[i] = bigList[i + bigList.length/2];
            System.out.println(smallList2[i]);
        }


    }
}
