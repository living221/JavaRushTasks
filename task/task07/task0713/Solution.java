package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> listMisc = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++){
            String s = reader.readLine();
            int tmp = Integer.parseInt(s);
            list.add(tmp);
        }

        for (int i = 0; i < list.size(); i++){
            int tmp = list.get(i);
            if (tmp % 2 == 0){
                list2.add(tmp);
                if (tmp % 3 == 0){
                    list3.add(tmp);
                }
            }
            else if (tmp % 3 == 0){
                list3.add(tmp);
            }
            else listMisc.add(tmp);
        }
        printList(list3);
        System.out.println();
        printList(list2);
        System.out.println();
        printList(listMisc);
        System.out.println();
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
