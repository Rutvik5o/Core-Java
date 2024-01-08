//(10)=>The abstract Vegetable class has four subclasses named cabbage, carrot andpotato. Write an application that demonstrates how to establish this class
//hierarchy. Declare one instance variable of type string that indicates the color ofa vegetable. Create and display instances of these object. Override the toString()
//method of object to return a string with the name of the vegetable and its color.


abstract class Vegetable
{
    String color; //Instance Variable
}

class Cabbage extends Vegetable
{
    public String toString()
    {
        color="Green Color";

        return("Color Of Cabbage=> "+color);
    }
}

class Carrot extends Vegetable
{
    public String toString()
    {
        color="Red Color";

        return("Color Of Carrot=> "+color);
    }
}

class Patato extends Vegetable
{
    public String toString()
    {
        color="Brown Color";

        return("Color of Patato=> "+color);
    }
}

class U30
{
    public static void main(String []args)
    {
        Cabbage Obj=new Cabbage();
        System.out.println(Obj);

        Carrot Obj1=new Carrot();
        System.out.println(Obj1);

        Patato Obj2=new Patato();
        System.out.println(Obj2);
    }

}

