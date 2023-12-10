import java.util.Scanner;

class TaxCal
{
    public static void main(String []args)
    {
        int sal;
        double tax;

         System.out.println("Enter Your Salary=> ");

         Scanner Obj=new Scanner(System.in);

         sal=Obj.nextInt();

         if(sal<=10000)
         {
            System.out.println("No Tax on " + sal);
         }
         else if(sal>10000 && sal<=100000)
         {
            tax=sal*0.10;

             System.out.println(" Tax=> " + tax);
         }
         else
         {
            tax=sal*0.20;

            System.out.println(" Tax=> " + tax);
         }


    }
}

