package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,String> map=new HashMap<String, String>();
        String city=new String();
        String sname=new String();
        while(true)
        {
            city=reader.readLine();
            if(city.isEmpty())
                break;
            sname=reader.readLine();
            if(sname.isEmpty())
                break;
            map.put(city,sname);
        }
        String s=reader.readLine();
        System.out.println(work(map,s));

    }
    public static String work(Map<String,String> map,String s)
    {
        String temp=new String();
        for(Map.Entry<String,String> pair:map.entrySet())
        {
            String key=pair.getKey();
            String value=pair.getValue();
            if(s.equals(key))
            {
                temp=value;
                break;
            }
            else temp="Not founr";
        }
        return temp;
    }
}
