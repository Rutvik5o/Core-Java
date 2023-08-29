import java.util.Scanner;


class SimpleIf
{
    public static void main(String []args)
    {
         int age;

         System.out.println("Enter Your Age-> ");

         Scanner ref=new Scanner(System.in);

         age=ref.nextInt();

         if(age>=18)
         {
             System.out.println("YOur Eligible For Vote");
         }

         System.out.println("Thank You");
    }

}