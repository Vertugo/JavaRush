package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       /* String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);

        System.out.println(catMother);
        System.out.println(catDaughter);*/
        String Dad=reader.readLine();
        Cat dad=new Cat(Dad);
        //System.out.println(dad);
        String Granny=reader.readLine();
        Cat granny=new Cat(Granny);
      //  System.out.println(granny);
        String fatherKorifey=reader.readLine();
        Cat fatherkorifey=new Cat(fatherKorifey,dad,null);
     //   System.out.println(fatherkorifey);
        String motherVasilisa=reader.readLine();
        Cat mothirvasilisa=new Cat(motherVasilisa,null,granny);
      //  System.out.println(mothirvasilisa);
        String Myrchik=reader.readLine();
        Cat myrshik=new Cat(Myrchik,fatherkorifey,mothirvasilisa);
       // System.out.println(myrshik);
        String Pyshunka=reader.readLine();
        Cat pyshunka=new Cat(Pyshunka,fatherkorifey,mothirvasilisa);
        System.out.println(dad);
        System.out.println(granny);
        System.out.println(fatherkorifey);
        System.out.println(mothirvasilisa);
        System.out.println(myrshik);
        System.out.println(pyshunka);
    }

    public static class Cat
    {
        private String name;
        private Cat parent;
        private Cat parent1;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat parent,Cat parent1)
        {
            this.name = name;
            this.parent = parent;
            this.parent1=parent1;
        }

        @Override
        public String toString()
        {
            if (parent == null&&parent1==null)
                return "Cat name is " + name + ", no mother, no father";
            if(parent1==null&&parent!=null)
                return "Cat name is " + name + ", no mother"+", father is "+parent.name;
            if(parent1!=null&&parent==null)
                return"Cat name is "+name+", mother is " +parent1.name+", no father";
            else
                return "Cat name is "+name+", mother is "+parent1.name+", father is "+parent.name;
        }
    }

}
