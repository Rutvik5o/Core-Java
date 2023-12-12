import java.util.Scanner;
import java.lang.Math;

public class AOT {

    public static void main(String []args)
    {
        int a,b,c,sp;
        double area;

        System.out.println("Enter Value for side of trinagle-> ");

        Scanner r=new Scanner(System.in);

        a=r.nextInt();

        b=r.nextInt();

        c=r.nextInt();

        sp=(a+b+c)/2;

        area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));

        System.out.println("Area of Triangle=> " + area);
    }


    
}
