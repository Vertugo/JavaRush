package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import com.sun.security.auth.SolarisNumericUserPrincipal;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human Ann=new Human("Ann",false,61,null,null);
        Human Tamara=new Human("Tamara",false,65,null,null);
        Human Vasya=new Human("Vasya",true,70,null,null);
        Human Petya=new Human("Petya",true,75,null,null);
        Human Alina=new Human("Alina",false,25,Petya,Tamara);
        Human Igor=new Human("Igor",true,28,Vasya,Ann);
        Human son1=new Human("Anatoliy",true,4,Igor,Alina);
        Human son2 =new Human("Sergey",true,3,Igor,Alina);
        Human son3=new Human("Gleb",true,8,Igor,Alina);
        System.out.println(Tamara);
        System.out.println(Ann);
        System.out.println(Vasya);
        System.out.println(Petya);
        System.out.println(Igor);
        System.out.println(Alina);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        public Human(String name,boolean sex,int age,Human father,Human mother)
        {
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
