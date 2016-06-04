package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.util.*;

public class Solution {
    public static void main(String[] args)throws Exception{

        FileInputStream fileInputStream = new FileInputStream(args[0]);
        byte[] symbols = new byte[fileInputStream.available()];
        fileInputStream.read(symbols);
        Arrays.sort(symbols);
        HashMap<Byte,Integer> map = new HashMap<Byte, Integer>();
        for(byte x:symbols){
            int count=0;
            for(byte x1:symbols){
                if(x1==x){
                    count++;
                }
            }
            if(!map.containsKey(x)){
                map.put(x,count);
                System.out.println((char)x +" "+ count);
            }
        }

        fileInputStream.close();
    }
}
