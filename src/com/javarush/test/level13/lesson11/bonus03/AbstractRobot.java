package com.javarush.test.level13.lesson11.bonus03;

public abstract class AbstractRobot implements Attackable,Defensable
{
    public BodyPart attack()
    {
        BodyPart attackedBodyPart = null;
        Robot.hitCount = Robot.hitCount + 1;

        if (Robot.hitCount == 1)
        {
            attackedBodyPart =  BodyPart.ARM;
        } else if (Robot.hitCount == 2)
        {
            attackedBodyPart =  BodyPart.HEAD;
        } else if (Robot.hitCount == 3)
        {

            attackedBodyPart =  BodyPart.LEG;
        } else if (Robot.hitCount == 4)
        {
            Robot.hitCount=0;
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    public BodyPart defense()
    {
        BodyPart defencedBodyPart = null;
        Robot.hitCount = Robot.hitCount + 1;

        if (Robot.hitCount == 1)
        {
            defencedBodyPart =  BodyPart.HEAD;
        } else if (Robot.hitCount == 2)
        {
            defencedBodyPart =  BodyPart.LEG;
        } else if (Robot.hitCount == 3)
        {
            defencedBodyPart =  BodyPart.ARM;
        } else if (Robot.hitCount==4)
        {
            Robot.hitCount = 0;
            defencedBodyPart=BodyPart.CHEST;
        }
        return defencedBodyPart;
    }
}
