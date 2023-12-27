//(6)-> Write a program to calculate the area of square and rectagle by overloading the area method.
public class U6 {

    void area(int l)
    {
        System.out.println("Area of Square=> "+(l*l));
    }

    void area(int l,int b)
    {
        System.out.println("Area of Rectangle=> "+(l*b));
    }

    public static void main(String []args)
    {
        U6 one=new U6();

        one.area(6);

        one.area(6,7);

    }
    
}
