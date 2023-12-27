//(5)-> Write a program to calculate the hypotenuse of right angled triangle
//      when other sides of the trangle are given.
//      (Hypotenuse-> square root (x*x + y*y) using command line argument
import java.util.Scanner;

public class U5 {

    public static void main(String []args)
    {
        Scanner Obj=new Scanner(System.in);

        System.out.println("Enter Value of x & y->");

        int a=Obj.nextInt();

        int b=Obj.nextInt();

        double hyp=Math.sqrt((a*a)+(b*b));

        System.out.println("Hypotenuse=> "+hyp);
    }
    
}
