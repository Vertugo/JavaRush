package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Alex on 30.01.2016.
 */
public final class Moon implements  Planet
{
    private static Moon moon=new Moon();
    private Moon(){};
    public static Moon getInstance()
    {
        return moon;
    }
}
