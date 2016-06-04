package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args)throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1=reader.readLine();
        String filename2=reader.readLine();
        String filename3=reader.readLine();
        FileInputStream fileInputStream=new FileInputStream(filename2);
        FileInputStream fileInputStream1=new FileInputStream(filename3);
        FileOutputStream fileOutputStream = new FileOutputStream(filename1);
        while(fileInputStream.available()>0){
            fileOutputStream.write(fileInputStream.read());
        }
        while(fileInputStream1.available()>0){
            fileOutputStream.write(fileInputStream1.read());
        }

        fileInputStream.close();
        fileInputStream1.close();
        fileOutputStream.close();
        reader.close();
    }
}
