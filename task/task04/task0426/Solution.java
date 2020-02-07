package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String n1 = bufferedReader.readLine(); //читаем строку с клавиатуры
        int in1 = Integer.parseInt(n1); //преобразовываем строку в число.

        if ((in1 % 2 == 0) && in1 < 0) System.out.println("отрицательное четное число");
        else if ((in1 % 2 != 0) && in1 < 0) System.out.println("отрицательное нечетное число");
        else if (in1 == 0) System.out.println("ноль");
        else if ((in1 % 2 == 0) && in1 > 0) System.out.println("положительное четное число");
        else if ((in1 % 2 != 0) && in1 > 0) System.out.println("положительное нечетное число");

    }
}
