package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> list=new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        String s="именно";
        int i=-1;
        while(true)
        {
            i+=2;
            list.add(i,s);
            if(i==5) break;
        }
        for(int j=0;j<list.size();j++)
            System.out.println(list.get(j));
    }
}
