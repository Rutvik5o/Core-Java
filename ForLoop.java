import java.util.Scanner;

class ForLoop
{
    public static void main(String []args)
    {

        int m;

        System.out.println("Enter How many Number you want to print-> ");

        Scanner r=new Scanner(System.in);

        m=r.nextInt();
        for(int i=1;i<=m;i++)
        {
            System.out.print(i+" ");
        }
    }
}