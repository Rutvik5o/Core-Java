//(9)=> Create Class calculation with an abstract method area(). Create Rectangle 
// and Triangle subclasses of calculation and find area of rectangle and triangle.

abstract class calculation
{
     int l,b;

     abstract void area();
}

class rect extends calculation
{
    rect(int p,int q)
    {
        l=p;
        b=q;
    }

    void area()
    {
        System.out.println("\nArea of Rectangle => "+(l*b));
    }
}

class tri extends calculation
{
    tri(int p,int q)
    {
        l=p;
        b=q;
    }

    void area()
    {
        System.out.println("\nArea of Trianlge=> "+((l*b)/2));
    }
}


class U29
{
    public static void main(String []args)
    {
        rect Obj1=new rect(5,8);

        Obj1.area();

        tri Obj2=new tri(7,2);

        Obj2.area();
    }
}

