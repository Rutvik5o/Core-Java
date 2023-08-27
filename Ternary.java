import java.util.Scanner;

class Ternary
{
    public static void main(String []args)
    {
        int a,b,c,Max;

        System.out.println("Enter Three Number-> ");

        Scanner Obj=new Scanner(System.in);

        a=Obj.nextInt();

        b=Obj.nextInt();

        c=Obj.nextInt();

        Max=(a>b)?  (a>c? a:c) : (b>c? b:c);

        System.out.println("Max=> "+Max);


    }
}