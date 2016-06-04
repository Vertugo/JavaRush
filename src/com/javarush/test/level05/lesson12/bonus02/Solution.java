package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        if (a < b && a < c && a < d && a < e )
        {System.out.println("Minimum = " + a);}
        else if (b < a && b < c && b < d && b < e )
        {System.out.println("Minimum = " + b);}
        else if (c < a && c < b && c < d && c < e)
        {System.out.println("Minimum = " + c);}
        else if (d < a && d < b && d < c && d < e)
        {System.out.println("Minimum = " + d);}
        else if (e < a && e < b && e < c && e < d)
        {System.out.println("Minimum = " + e);}


    }


    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }
    public static int supermin(int a,int b,int c,int d,int e)
    {
        int min=0;
        if(a<b && a<c && a<d&& a<e)
        {
            min=a;
        }
        if(b<a && b<c && b<d&& b<e)
        {
            min=b;
        }
        if(c<b && c<a && c<d&& c<e)
        {
            min=c;
        }
        if(d<b && d<c && d<a&& d<e)
        {
            min=d;
        }
        if(e<b && e<c && e<d&& e<a)
        {
            min=a;
        }
        return min;
    }
}
