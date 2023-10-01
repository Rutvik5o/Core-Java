import java.util.Scanner;

class POREGN
{

    public static void main(String []args)
    {

        int n,i,sum=0;

        System.out.println("Enter Odd Or Even Number Util You Want Addition-> ");

        Scanner m=new Scanner(System.in);

        n=m.nextInt();

        if(n%2==0)
        {
            for(i=0;i<=n;i+=2)
            {
                sum+=i;
            }
          System.out.println("Sum of Even Number=> " + sum);
        
        }
        else
        {
             for(i=1;i<=n;i+=2)
             {
                sum+=i;

             }

          System.out.println("Sum of Odd Number=> " + sum);
        }
    }
}