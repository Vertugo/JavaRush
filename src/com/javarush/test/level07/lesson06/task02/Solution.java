package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++)
        {
            list.add(reader.readLine());
        }
        String s=list.get(0);
        int n=s.length();
        for(int i=1;i<list.size();i++)
        {
            String s1=list.get(i);
            int n1=s1.length();
            if(n1>n)
                n=n1;
        }
        for(int i=0;i<list.size();i++)
        {
            String r=list.get(i);
            if(r.length()==n)
                System.out.println(list.get(i));
        }

    }
}
