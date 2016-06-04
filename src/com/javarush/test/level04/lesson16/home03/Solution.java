package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        int temp=0;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            String s=reader.readLine();
            int x=Integer.parseInt(s);
            temp+=x;
            if(x==-1)
            {
                System.out.println(temp);
                break;
            }
        }
    }
}
