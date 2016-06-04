package com.javarush.test.level17.lesson10.bonus02;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion
!!!РЕКОМЕНДУЕТСЯ выполнить level17.lesson10.bonus01 перед этой задачей!!!

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u  - обновляет соответствующие данные людей с заданными id
-d  - производит логическое удаление всех людей с заданными id
-i  - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
*/

public class Solution {
    public volatile static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args)throws Exception{
        //start here - начни тут
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
        int n = args.length;
        if(n<2)
            return;
        if(args[0].equals("-c"))
        {
             for(int i=1;i<n;i+=3)
             {
                 Person person;
                 if(args[i+1].equals("м"))
                 {
                     person=Person.createMale(args[i],simpleDateFormat.parse(args[i+2]));
                 }else
                 {
                     person=Person.createFemale(args[i],simpleDateFormat.parse(args[i+2]));
                 }
                 allPeople.add(person);
                 System.out.println(allPeople.indexOf(person));
             }
        }
        if(args[0].equals("-u"))
        {
            for (int i = 1; i < n; i += 4)
            {
                Person person = allPeople.get(Integer.parseInt(args[i]));
                person.setBirthDay(simpleDateFormat.parse(args[i + 3]));
                if (args[i + 2].equals("м"))
                {
                    person.setSex(Sex.MALE);
                } else person.setSex(Sex.FEMALE);
                person.setName(args[i + 1]);
                allPeople.set(Integer.parseInt(args[i]), person);
            }
        }
            if(args.equals("-d"))
            {
                for(int i=1;i<n;i++)
                {
                    int id=Integer.parseInt(args[i]);
                    Person person=allPeople.get(id);
                    person.setBirthDay(null);
                    person.setName(null);
                    person.setSex(null);
                }
            }else if(args[0].equals("-i"))
            {
                for(int i=1;i<n;i++)
                {
                    Person person=allPeople.get(Integer.parseInt(args[i]));
                    System.out.println(person.getName()+" "+convert(person.getSex())+" "+simpleDateFormat1.format(person.getBirthDay()));
                }
            }

    }
    public static String convert(Sex sex)
    {
        if(sex==Sex.FEMALE)
            return "ж";
        else
            return "м";
    }
}
