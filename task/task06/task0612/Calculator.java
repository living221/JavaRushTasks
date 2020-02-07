package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        int result = a + b;
        return result;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        int result = a - b;
        return result;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int result = a * b;
        return result;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        double result = ((double) a / b);
        return result;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        double pr = ((double) b / 100);
        //System.out.println(pr);
        double result = a * pr;
        //System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        //System.out.println(Calculator.division(400, 20));
        //System.out.println(percent(4, 50));
    }
}