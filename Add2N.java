import java.util.Scanner;


class Add2N
{
    public static void main(String []args)
    {
        int a,b,sum;

        System.out.println("Enter Two Number-> ");

        Scanner c=new Scanner(System.in);

        a=c.nextInt();

        b=c.nextInt();

        sum=a+b;

        System.out.println("Addition Of Two Number-> " + sum);
    }
}