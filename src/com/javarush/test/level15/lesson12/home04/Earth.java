package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Alex on 30.01.2016.
 */
public final class Earth implements Planet
{
    private static Earth earth=new Earth();
    private Earth(){}
    public static Earth getInstance()
    {
        return earth;
    }
}
