// Input Outupt through scanner 
import java.util.Scanner;
class JIO
{
     public static void main(String arg[])
     {
        int a;

        System.out.println("Enter Data-> ");

        Scanner obj=new Scanner(System.in);

        a=obj.nextInt();

        System.out.println("Data=> "+a);
     }
}