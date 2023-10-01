import java.util.Scanner;

class PFNN
{
    public static void main(String []args)
    {
        int n;

        System.out.println("Enter Number Which until you want to print natural Number-> ");

        Scanner m=new Scanner(System.in);

        n=m.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.print(i+ " ");
        }
    }
}