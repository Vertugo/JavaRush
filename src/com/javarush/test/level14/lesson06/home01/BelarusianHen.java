package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Alex on 20.01.2016.
 */
public class BelarusianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 400;
    }

    @Override
  public  String getDescription()
    {
        return super.getDescription()+" Моя страна - "+ Country.BELARUS +". Я несу " +getCountOfEggsPerMonth()+ " яиц в месяц.";
    }

}
