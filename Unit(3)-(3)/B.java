package pack2;

import pack1.A;

public class B
{
    public static void main(String []args)
    {
        A Obj1=new A();

        System.out.println("\nInstance Variable=> "+Obj1.a);

        System.out.println("\nInstance Method Calling:");

        Obj1.display();
    }
}

//javac -d. A.java
//javac -d B.java
//java pack2.B
