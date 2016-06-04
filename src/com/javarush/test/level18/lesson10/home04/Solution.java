package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args)throws Exception{
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String filename1=reader.readLine();
        String filename2=reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(filename2);
        FileOutputStream fileOutputStream = new FileOutputStream(filename1);
        while(fileInputStream.available()>0){
            fileOutputStream.write(fileInputStream.read());
        }
        reader.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
