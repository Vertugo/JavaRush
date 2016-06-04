package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(filename);
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        while(fileInputStream.available()>0){
            int key = fileInputStream.read();
            if(map.containsKey(key)){
                int value = map.get(key);
                map.put(key,++value);
            }else{
                map.put(key,1);
            }
        }

        reader.close();
        fileInputStream.close();

        int maxValue=0;
        for(Map.Entry<Integer,Integer> pair:map.entrySet()){
            int temp=pair.getValue();
            if(maxValue<temp){
                maxValue = temp;
            }
        }

        for(Map.Entry<Integer,Integer>pair:map.entrySet()){
            if(pair.getValue()==maxValue){
                System.out.println(pair.getKey());
            }
        }
    }
}
