package com.javarush.task.task07.task0707;

import java.util.ArrayList;
//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        ArrayList<String> list = new ArrayList<String>();

        String s0 = "I";
        String s1 = "was";
        String s2 = "born";
        String s3 = "for";
        String s4 = "loving you baby";

        list.add(0, s0);
        list.add(1, s1);
        list.add(2, s2);
        list.add(3, s3);
        list.add(4, s4);

        System.out.println(list.size());

        for (int i = 0; i < 5; i++)
        {
            System.out.println( list.get(i) );
        }
    }
}
