package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String N1=reader.readLine() ;
        int N=Integer.parseInt(N1);
        String temp=reader.readLine();
        int a=Integer.parseInt(temp);
        int maximum=a;
        for(int i=0;i<N-1;i++)
        {
            temp=reader.readLine();
            a=Integer.parseInt(temp);
            if(a>maximum)
            {
                maximum=a;
            }
        }

        //напишите тут ваш код




        System.out.println(maximum);
    }
}
