package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        int count=0;
        try{
            FileInputStream fileInputStream = new FileInputStream(args[0]);
            while(fileInputStream.available()>0){
                int data=fileInputStream.read();
                if(data>=Integer.valueOf('a')&&data<=Integer.valueOf('z')||data>=Integer.valueOf('A')&&data<=Integer.valueOf('Z')){
                    count++;
                }

            }
            fileInputStream.close();
            System.out.println(count);
        }catch (Exception e ){}
    }
}
