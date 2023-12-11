import java.util.Scanner;

class AOC
{
    public static void main(String []args)
    {
        final double pi=3.14;
        double area;

        int r;

        System.out.println("Enter Radius Of Circle-> ");

        Scanner ref=new Scanner(System.in);

        r=ref.nextInt();

        area=pi*r*r;

        System.out.println("Area of Circle=> "+ area);




    }
}