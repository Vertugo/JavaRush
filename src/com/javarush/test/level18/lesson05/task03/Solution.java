package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args)throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        String filename3 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(filename1);
        FileOutputStream fileOutputStream1 = new FileOutputStream(filename2);
        FileOutputStream fileOutputStream2 = new FileOutputStream(filename3);

        int count = fileInputStream.available();
        if(count%2==0){
            count/=2;
            byte[] buffer = new byte[count];
            fileOutputStream1.write(buffer,0,fileInputStream.read(buffer));
            fileOutputStream2.write(buffer,0,fileInputStream.read(buffer));
        }else{
            count/=2;
            byte[] bytes1 = new byte[count+1];
            byte[] bytes2 = new byte[fileInputStream.available()-count+1];
            fileOutputStream1.write(bytes1,0,fileInputStream.read(bytes1));
            fileOutputStream2.write(bytes2,0,fileInputStream.read(bytes2));
        }

        reader.close();
        fileInputStream.close();
        fileOutputStream1.close();
        fileOutputStream2.close();
    }
}
