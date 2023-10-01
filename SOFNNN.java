import java.util.Scanner;

class SOFNNN
{
    public static void main(String []args)
    {
        int n,sum=0;

        System.out.println("Enter Number Which number Untill In You Want to Addition of that Number-> ");

        Scanner r=new Scanner(System.in);

        n=r.nextInt();

        for(int i=1;i<=n;i++)
        {
           // System.out.println(i);
            sum+=i;
        }

        System.out.println("Addition Of Number until Which you Entered Number=> " + sum);
    }
}