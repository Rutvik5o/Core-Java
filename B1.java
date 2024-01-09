package xyz1;

class A1 
{
    protected void show()
    {
        System.out.println("Using Protected");
    }
}

class B1  //extends A1
{
    public static void main(String []args)
    {
        A1 Obj=new A1();  //B1
        Obj.show();
    }
}

//But on that need to make super class object to call
//but you can extends superclass that can call through subclas object.

//javac -d . B1.java
//java xyz1.B1