import java.util.Scanner;


class A{

    int a; String b; boolean c;

    A()
    {
        a=1020; b="ankush" ; c=false;      //if we dont' use default constructor then automatic value initalize

    }

    void Disp()
    {
        System.out.println(a+ " "+b+ " "+c);
    }
    
}


class DCO
{
    public static void main(String []args)
    {
        A r=new A();
        r.Disp();
    }

}

