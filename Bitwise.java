import java.util.Scanner;

class Bitwise // &,|,^,~
{
    public static void main(String []args)
    {
         int a,b;

         System.out.println("Enter Two Number-> ");

         Scanner obj=new Scanner(System.in);

         a=obj.nextInt();

         b=obj.nextInt();

         System.out.println("AND=> "+(a&b));

         System.out.println("OR=> "+(a|b));

         System.out.println("XOR=> "+(a^b));

         System.out.println("Complement=> "+(~a));


    }
}