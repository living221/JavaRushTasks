package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {

        int min1 = 0;
        int min2 = 0;
        int min = 0;

        if (a <= b) {
            min1 = a;
        }
        else min1 = b;
        //System.out.println(min1);

        if (c <= d) {
            min2 = c;
        }
        else min2 = d;
        //System.out.println(min2);

        if (min1 <= min2){
            min = min1;
        }

        else min = min2;
        //System.out.println(min);

        if (min <= e){
            return min;
        }

        else return e;
    }
}
