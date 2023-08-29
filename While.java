import java.util.Scanner;
class While
{
    public static void main(String []args)
    {
        int n=1,m;

        System.out.println("Enter How Many time you want to print-> ");

        Scanner r=new Scanner(System.in);

        m=r.nextInt();

        while(n<=m)
        {
            System.out.println("While Loop");
            n++;
        }
    }
}