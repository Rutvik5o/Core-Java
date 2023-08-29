import java.util.Scanner;


class IfElse
{
     public static void main(String []args)
     {
        int no;


        System.out.println("Enter Any Number-> ");

        Scanner ref=new Scanner(System.in);

        no=ref.nextInt();

        if(no>=0)
        {
            System.out.println("+Ve Number");
        }
        else
        {
            System.out.println("-Ve Number");
        }
     }
}