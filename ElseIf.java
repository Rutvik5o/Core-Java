import java.util.Scanner;


class ElseIf
{
    public static void main(String []args)
    {
        int marks;

        System.out.println("Enter Number-> ");

        Scanner r=new Scanner(System.in);

        marks=r.nextInt();

        if(marks>80)
        {
            System.out.println("Topper");
        }
        else if(marks<80 && marks >=60)
        {
            System.out.println("First");
        }
        else
        {
             System.out.println("Second");
        }
    }
}