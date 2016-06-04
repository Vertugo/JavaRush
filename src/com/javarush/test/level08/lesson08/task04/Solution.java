package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Spice",new Date("JUNE 10 1997"));
        map.put("Hitler",new Date("AUGUST 23 1890"));
        map.put("Napoleon",new Date("NOVEMBER 14 1740"));
        map.put("Stalin",new Date("DECEMBER 30 1890"));
        map.put("Stallonwe", new Date("JUNE 1 1980"));
        map.put("Spicere",new Date("JUNE 10 1997"));
        map.put("Hitlerer",new Date("AUGUST 23 1890"));
        map.put("Napoleonok",new Date("NOVEMBER 14 1740"));
        map.put("Stalinchik",new Date("DECEMBER 30 1890"));
        return map;
        //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String,Date>> iterator=map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Date d = iterator.next().getValue();
            if(d.getMonth()>4&&d.getMonth()<8)
                iterator.remove();
        }
        //напишите тут ваш код

    }
}
