package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man Max=new Man("Max",18,"Odessa");
        Man Oleg=new Man("Oleg",21,"Yzhuk");
        Woman Masha=new Woman("Masha",18,"Kyiv");
        Woman Nastya=new Woman("Nastya",19,"Kyiv");
        System.out.println(Max.getName()+" "+Max.getAge()+" "+Max.getAddress());
        System.out.println(Oleg.getName()+" "+Oleg.getAge()+" "+Oleg.getAddress());
        System.out.println(Masha.getName()+" "+Masha.getAge()+" "+Masha.getAddress());
        System.out.println(Nastya.getName()+" "+Nastya.getAge()+" "+Nastya.getAddress());
        //выведи их на экран тут
    }

    //добавьте тут ваши классы
    static public class Man
    {
       private  String name;
        private int age;
       private  String address;
        public Man(String name,int age,String address)
        {
            this.name=name;
            this.age=age;
            this.address=address;
        }
        public String getName()
        {
            return this.name;
        }
        public int getAge()
        {
            return this.age;
        }
        public String getAddress()
        {
            return this.address;
        }
    }
    static public class Woman
    {
        private String name;
        private int age;
        private String address;
        public Woman(String name,int age,String address)
        {
            this.name=name;
            this.age=age;
            this.address=address;
        }
        public String getName()
        {
            return this.name;
        }
        public int getAge()
        {
            return this.age;
        }
        public String getAddress()
        {
            return this.address;
        }
    }
}
