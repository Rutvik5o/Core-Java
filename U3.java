//(3)=> A car accessories shop assigns code 1 to seat covers,2 to steering wheel covers, 3 to car lighting and 4 for air purifiers. All other items have code 5 or more.
//While selling the goods, a sales tax of 2% to seat covers, 3% for steering wheel covers,4% to car lighting ,2.5% to air purifiers and 1.2% for all other items is
//charged.A list containing the product code and price is given for making a bill. Write a java program using switch statements to prepare a bill.

import java.util.*;

class U3
{
    public static void main(String []args)
    {
         System.out.println("1 Seat Cover-> 15000rs.");

         System.out.println("2 Steering Wheel Cover-> 15000rs");

         System.out.println("3 Car Lighting-> 7000rs");

         System.out.println("4 Air Purifier-> 500rs");

         System.out.println("5 Other Items-> Enter Amount:");

         Scanner Obj=new Scanner(System.in);

         int ch=Obj.nextInt();

         double amount;

         switch(ch)
         {
             case 1: amount=15000+(15000*2)/100;
                     System.out.println("Seat Cover Total Charges=> "+amount);
                     break;

             case 2: amount=15000+(15000*3)/100;
                     System.out.println("Steering Wheel Cover Total Charges=> "+amount);
                     break;

             case 3: amount=7000+(7000*4)/100;
                     System.out.println("Car Lighting Total Charges=> "+amount);
                     break;

             case 4: amount=500+(500*2.5)/100;
                     System.out.println("Air Purifier Total Charges=> "+amount);
                     break;

             case 5: System.out.println("Enter Item-> ");
                     String name=Obj.next();

                     System.out.println("Enter Amount-> ");

                     double itemAmount=Obj.nextDouble();
                 
                     itemAmount=itemAmount+(itemAmount*12)/100;
                 
                     System.out.println(name+" Total Charges=> "+itemAmount);

                     break;

            default: System.out.println("Sorry,You Entered Wrong Choice!");
            

                    
         }
    }
}
