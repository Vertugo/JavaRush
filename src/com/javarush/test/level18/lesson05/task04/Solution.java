package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args)throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        String filename2 = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(filename);
        FileOutputStream fileOutputStream = new FileOutputStream(filename2);

        byte[]bytes=new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        for(int i=bytes.length-1;i>=0;i--){
            fileOutputStream.write(bytes[i]);
        }

        reader.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
