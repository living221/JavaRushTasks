package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++)
        {
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
            int s = Integer.parseInt(reader1.readLine());
            if (s > maximum)
            {
                maximum = s;
            }
        }
        //напишите тут ваш код

        System.out.println(maximum);
    }
}
