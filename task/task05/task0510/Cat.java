package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name)
    {
        this.name = name;
        this.age = 3;
        this.weight = 3;
        this.color = "unknown";
        this.address = null;
    }

    public void initialize(String name, int weight, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "unknown";
        this.address = null;
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "unknown";
        this.address = null;
    }

    public void initialize(int weight, String color)
    {
        this.weight = weight;
        this.color = color;
        this.age = 3;
        this.address = null;
        this.name = null;

    }

    public void initialize(int weight, String color, String address)
    {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 3;
        this.name = null;
    }

    public static void main(String[] args) {

        //Cat cat1 = Cat.initialize("bob", 3, 5);

    }
}
