package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Alex on 30.01.2016.
 */
public final class Sun implements Planet
{
    private static final Sun sun=new Sun();
    private Sun(){}
    public static  Sun getInstance()
    {
        return sun;
    }
}
