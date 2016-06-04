package com.javarush.test.level06.lesson11.home05;

/* Есть новые идеи? Подумаем...
1. В классе Solution создать public статический класс Idea
2. В классе Idea создать метод public String getDescription(), который будет возвращать любой непустой текст
3. В классе Solution создайте статический метод public void printIdea(Idea idea), который будет выводить
на экран описание идеи - это то, что возвращает метод getDescription
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
   static   public void printIdea(Idea idea) throws  Exception
    {
        System.out.println(idea.getDescription());
    }
    public static void main(String[] args) throws Exception
    {
        printIdea(new Idea());
    }
    static public class Idea
    {
        public String getDescription() throws  Exception
        {
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            String s="hi";
            if(s.length()>0)
            return s;
            else return null;
        }
    }

    //Добавьте тут класс Idea
}
