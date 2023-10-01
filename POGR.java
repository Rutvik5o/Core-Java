import java.util.Scanner;

class POGR
{
    public static void main(String []args)
    {
        int n;

        System.out.println("Enter Range in which you want to print odd Number-> ");
        

        Scanner o=new Scanner(System.in);

        n=o.nextInt();

        for(int i=1;i<=n;i+=2)
        {
             System.out.print(i+ " ");
        }
    }
}