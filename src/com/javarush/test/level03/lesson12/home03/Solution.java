package com.javarush.test.level03.lesson12.home03;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/
//import java.io.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String sn=reader.readLine();
        int n =Integer.parseInt(sn);
        System.out.println("iadsfdf ٥$"+n+" в час");
        //напишите тут ваш код
    }
}