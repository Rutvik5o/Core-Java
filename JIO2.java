// taking two values from user and display it through scanner object

import java.util.Scanner;

class JIO2
{
    public static void main(String args[])
    {
        int a,b;

        Scanner obj=new Scanner(System.in);

        System.out.println("Enter Value-> ");

        a=obj.nextInt();

        b=obj.nextInt();

        System.out.println(a+"\n"+b);
    

    }
}

