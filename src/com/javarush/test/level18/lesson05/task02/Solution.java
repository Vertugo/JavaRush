package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename = bufferedReader.readLine();
        int count =0;

        FileInputStream fileInputStream = new FileInputStream(filename);
        while (fileInputStream.available()>0){
            int temp = fileInputStream.read();
            if(temp==44){
                count++;
            }
        }
        fileInputStream.close();
        bufferedReader.close();
        System.out.println(count);
    }
}
