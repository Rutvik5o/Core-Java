class a
{
    int x,y;

    a(int a,int b)
    {
        x=a; y=b;
    }

    a(int a,String b)
    {
        System.out.println(a+" "+b);
    }

    void show()
    {
        System.out.println(x+" "+y);
    }
}

class PCO
{
    public static void main(String[] args)
    {
        a r=new a(100,200);

        r.show();

        a ref=new a(10,"Welcome");

        

    }
}