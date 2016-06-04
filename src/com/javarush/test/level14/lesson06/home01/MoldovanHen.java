package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Alex on 20.01.2016.
 */
public class MoldovanHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 300;
    }

  public   String getDescription()
    {
        return super.getDescription()+" Моя страна - "+ Country.MOLDOVA +". Я несу " +getCountOfEggsPerMonth()+ " яиц в месяц.";
    }
}
