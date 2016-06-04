package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> child=new ArrayList<Human>();
        Human son1=new Human("Alfred",true,4,new ArrayList<Human>());
        Human son2=new Human("Gleb",true,3,new ArrayList<Human>());
        Human son3=new Human("Alex",true,5,new ArrayList<Human>());
        child.add(son1);
        child.add(son2);
        child.add(son3);
        ArrayList<Human> parents1=new ArrayList<Human>();
        ArrayList<Human> parents2=new ArrayList<Human>();
        Human mather=new Human("Diana",false,18,child);
        Human father=new Human("Alexey",true,18,child);
        parents1.add(mather);
        parents2.add(father);
        Human dad1=new Human("Ivan",true,68,parents1);
        Human gran1=new Human("Masha",false,60,parents1);
        Human dad2=new Human("Kolya",true,70,parents2);
        Human gran2=new Human("Varya",false,69,parents2);
        System.out.println(dad1);
        System.out.println(gran1);
        System.out.println(dad2);
        System.out.println(gran2);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);
        //напишите тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;
        //напишите тут ваш код
public Human(String name,boolean sex,int age,ArrayList<Human> children)
{
    this.name=name;
    this.sex=sex;
    this.age=age;
    this.children=children;
}
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
