import java.util.Scanner;
public class Max2N
 {

    public static void main(String []args)
    {
        int a,b;

        System.out.println("Enter Two Number-> ");

        Scanner r=new Scanner(System.in);

        a=r.nextInt();

        b=r.nextInt();

        if(a>b)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    


    }
    
}
