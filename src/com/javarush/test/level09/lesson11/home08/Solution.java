package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        ArrayList<int[]> list=new ArrayList<int[]>();
        int[]mas={1,2,3,4,5};
        list.add(mas);
        int[]mas1={1,2};
        list.add(mas1);
        int[]mas2={1,2,3,4};
        list.add(mas2);
        int[]mas3={1,2,3,4,5,6,7};
        list.add(mas3);
        int[]mas4=new int[0];
        list.add(mas4);
        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
