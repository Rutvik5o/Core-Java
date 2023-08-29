import java.util.Scanner;

class NestedIfElse
{
    public static void main(String []args)
    {
        int a,b,c;

        System.out.println("Enter Three Number-> ");

        Scanner r=new Scanner(System.in);

        a=r.nextInt();

        b=r.nextInt();

        c=r.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+"is Greater");
            }
            else
            {
                 System.out.println(c+" is Greater");
            }
        }
        else
        {
             if(b>c)
             {
                 System.out.println(b+" is Greater");
             }
             else
             {
                 System.out.println(c+"is Greater");
             }
        }
    }
}