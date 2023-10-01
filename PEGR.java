import java.util.Scanner;


class PEGR
{
    public static void main(String []args)
    {
        int n;


        System.out.println("Enter Range in which you want to print Even Number-> ");

        Scanner o=new Scanner(System.in);

        n=o.nextInt();

        for(int i=0;i<=n;i+=2)
        {
            System.out.print(i+ " ");
        }
    }

}