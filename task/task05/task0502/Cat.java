package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int myScore = 0;
        int enemyScore = 0;
        boolean fight = true;

        if (anotherCat.age > this.age) {
            enemyScore++;
        }
        else if (anotherCat.age == this.age) {
            enemyScore++;
            myScore++;
        }
        else if (anotherCat.age < this.age) {
            myScore++;
        }

        if (anotherCat.weight > this.weight) {
            enemyScore++;
        }
        else if (anotherCat.weight == this.weight) {
            enemyScore++;
            myScore++;
        }
        else if (anotherCat.weight < this.weight) {
            myScore++;
        }

        if (anotherCat.strength > this.strength) {
            enemyScore++;
        }
        else if (anotherCat.strength == this.strength) {
            enemyScore++;
            myScore++;
        }
        else if (anotherCat.strength < this.strength) {
            myScore++;
        }

        if (enemyScore > myScore) {
            return false;
        }

        if (myScore > enemyScore) {
            return true;
        }

        if (myScore == enemyScore) {
            return false;
        }

        return false;
        //System.out.println(enemyScore + " " + myScore);

    }

    public static void main(String[] args) {

/*        Cat vaska = new Cat();
        vaska.strength = 1000;
        vaska.age = 1;
        vaska.weight = 5;

        Cat borka = new Cat();
        borka.strength = 10001;
        borka.age = 11;
        borka.weight = 51;

        System.out.println(borka.fight(vaska));
*/
    }
}
