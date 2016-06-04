package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Alex on 20.01.2016.
 */
public class UkrainianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 200;
    }
   public String getDescription()
    {
        return super.getDescription()+" Моя страна - "+ Country.UKRAINE +". Я несу " +getCountOfEggsPerMonth()+ " яиц в месяц.";

    }
}
