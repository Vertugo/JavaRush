package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getCountTheSameFirstName(createMap(),"ere"));
        System.out.println(getCountTheSameLastName(createMap(),"ere"));
    }
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String,String> map=new HashMap<String, String>();
        map.put("Alex","Leybichenko");
        map.put("Ale","lassd");
        map.put("Ads","Leybihenko");
        map.put("Al","Asdwe");
        map.put("SD","SEW");
        map.put("S","Werty");
        map.put("Qas","Wety");
        map.put("dd","dfdd");
        map.put("dfd","ere");
        map.put("wew","fdre");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count=0;
        for(String check:map.values())
        {
            if(check.equals(name))
                count++;
        }
return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int count=0;
            if(map.containsKey(lastName))
                count++;
        return count;
    }
}
