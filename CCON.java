class a
{
    int a; String b;

    a()
    {
        a=10; b="hello";

        System.out.println(a+" "+b);

    }


    a(a ref)
    {
        a=ref.a;
        b=ref.b;

        System.out.println(a+ " "+b);
    }
}

class CCON
{
    public static void main(String []args)
    {
        a Obj=new a();
        a Obj2=new a(Obj);
    }
}