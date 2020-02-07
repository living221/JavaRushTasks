package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        int temp;
        while (true) {
            if (b < a) { temp = a; a = b; b = temp;}
            if (c < b) { temp = b; b = c; c = temp;}
            if (d < c) { temp = c; c = d; d = temp;}
            if (e < d) { temp = d; d = e; e = temp;}
            if (a <= b && b <= c && c <= d && d <= e) break;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        //напишите тут ваш код
    }
}
