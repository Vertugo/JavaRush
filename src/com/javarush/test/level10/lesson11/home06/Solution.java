package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import javax.swing.event.HyperlinkEvent;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        int weight;
        Human farher;
        Human mother;
        public Human(String name)
        {
            this.name=name;
        }
        public Human(String name,int age)
        {
            this.name=name;
            this.age=age;
        }
        public Human(String name,int age,boolean sex)
        {
            this.name=name;
            this.age=age;
            this.sex=sex;
        }
        public Human(String name,int age,boolean sex,int weight)
        {
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.weight=weight;
        }
        public Human(String name,int age,boolean sex,int weight,Human farher)
        {
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.weight=weight;
            this.farher=farher;
        }
        public Human(String name,int age,boolean sex,int weight,Human farher,Human mother)
        {
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.weight=weight;
            this.farher=farher;
            this.mother=mother;
        }
        public Human(int age,int weight)
        {
            this.age=age;
            this.weight=weight;
        }
        public Human(String name,Human farher)
        {
            this.name=name;
            this.farher=farher;
        }
        public Human(String name,boolean sex)
        {
            this.name=name;
            this.sex=sex;
        }
        public Human(Human farher,Human mother)
        {
            this.farher=farher;
            this.mother=mother;
        }
        //напишите тут ваши переменные и конструкторы
    }
}
