//(2)=> Write a program to create an array to store 5 integer values. Also initialize the 
//array with 5 numbers and display the array Elements in reverse order.


import java.util.Scanner;

class U22
{
    public static void main(String []args)
    {
        Scanner Obj=new Scanner(System.in);

        int a[]= new int [5];

        for(int i=0;i<=4;i++)
        {
            System.out.println("Enter the value of an Array-> ");

            a[i]=Obj.nextInt();
        }

        for(int i=4;i>=0;i--)
        {
            System.out.println("\nReverse Number of an Array=> "+a[i]);
        }
    }
}