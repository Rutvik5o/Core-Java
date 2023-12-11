import java.util.Scanner;

class AOR
{
    public static void main(String []args)
    {
        int l,b,area;

        System.out.println("Enter value of sides");

        Scanner r=new Scanner(System.in);

        l=r.nextInt();

        b=r.nextInt();

        area=l*b;

        System.out.println("Area of Rectangle=> "+area);
    }
}