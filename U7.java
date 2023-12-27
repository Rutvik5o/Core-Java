 //(7)-> Create a complex number class. The class should have a constructor 
 //      and methods to add, subtract and multiply two complex numbers 
 //      and to return the real and imaginary parts.
 class complex
{

    int real,img;

    complex() {}

    complex(int x,int y)
    {
        real=x;
        img=y;
    }

    complex add(complex a,complex b)
    {
        complex temp=new complex();
        temp.real=a.real+b.real;
        temp.img=a.img+b.img;
        return temp;
    }

    complex sub(complex a,complex b)
    {
        complex temp=new complex();
        temp.real=a.real-b.real;
        temp.img=a.img-b.img;
        return temp;
    }

    complex mul(complex a,complex b)
    {
        complex temp=new complex();
        temp.real=a.real*b.real;
        temp.img=a.img*b.img;
        return temp;
    }

    void display()
    {
        System.out.println("Real Number=> "+real+ "\nImaginary Part=> "+img+"+i");
    }
}

class U7
{
    public static void main(String []args)
    {
        complex c1=new complex(10,20);
        complex c2=new complex(30,40);
        complex c3=new complex();

        c3=c1.add(c1,c2);
        c3.display();

        c3=c1.sub(c1,c2);
        c3.display();

        c3=c1.mul(c1,c2);
        c3.display();
    }
}
