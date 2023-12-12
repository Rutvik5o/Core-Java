import java.util.Scanner;

public class AOS {

    public static void main(String []args)
    {
        int side,area;

        System.out.println("Enter Side Square-> ");
        Scanner r=new Scanner(System.in);

        side=r.nextInt();

        area=side*side;

        System.out.println("Area of Square=> "+ area);
    }
    
}
