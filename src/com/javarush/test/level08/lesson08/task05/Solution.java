package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String,String> map=createMap();
        removeTheFirstNameDuplicates(map);
        for(Map.Entry<String,String> pair:map.entrySet())
        {
            System.out.println(pair.getKey()+" - "+pair.getValue());
        }
    }
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("s1", "Alla");
        map.put("s2", "Nicolas");
        map.put("s3", "Nikita");
        map.put("s4", "Anton");
        map.put("s5", "Soso");
        map.put("s6", "Vlad");
        map.put("s7", "Vlad");
        map.put("s8", "Grisha");
        map.put("s9", "Zhanna");
        map.put("s10", "Anton");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
       /* String s=new String();
        HashMap<String,String> temp=new HashMap<String, String>();
        for(Map.Entry<String,String> pair:map.entrySet())
        {
            String key=pair.getKey();
            String value=map.get(key);
            if(!temp.containsValue(value))
                temp.put(key,value);
            else
            {
                removeItemFromMapByValue(temp,value);
            }
        }
        map.clear();
        for(Map.Entry<String,String> pair:temp.entrySet())
        {
            map.put(pair.getKey(),pair.getValue());
        }*/
//HashMap<String, String> map2 = new HashMap<String, String>();
        ArrayList<String> listName = new ArrayList<String>();
        //ArrayList<String> listFamil = new ArrayList<String>();
        for(Map.Entry<String,String> pair:map.entrySet()){
            String name = pair.getValue();
            //String famil = pair.getKey();
            listName.add(name);
            //listFamil.add(famil);
        }
        int[] count = new int[listName.size()];
        for(int i=0; i<count.length;i++){
            count[i] = 0;
        }
        ArrayList<String> listName2 = listName;
        for(int i=0; i<listName.size();i++){
            for(int j=0;j<listName2.size();j++){
                if(listName.get(i).equals(listName2.get(j)))
                    count[i]++;
            }
            if(count[i]>1){
                removeItemFromMapByValue(map , listName.get(i));
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
