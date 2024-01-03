//(3)=> Write a program to find sum of two matrices of 3X3.

import java.util.*;

class U23
{
    public static void main(String []args)
    {
        Scanner Obj=new Scanner(System.in);

        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];

        System.out.println("Enter Elements of first matrix of order 3X3:");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter first matrix of an array-> ");

                a[i][j]=Obj.nextInt();
            }
        }

        System.out.println("Enter Elements of Second matrix of order 3X3");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter Second matrix of an array-> ");
                b[i][j]=Obj.nextInt();
            }
        }

    

       System.out.println("The Addition of matrices:");

       for (int i=0; i<3; i++)
        {
           for (int j=0; j<3; j++) 
           {
               c[i][j] = a[i][j] + b[i][j];

               System.out.print(c[i][j] + "\t");
           }
           System.out.println();
       }
    }
}