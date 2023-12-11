import java.util.Scanner;
public class CalWS {

    public static void main(String []args)
    {
        int n1,n2,ch,cal;

        System.out.println("Enter Two Number=> ");

        Scanner r=new Scanner(System.in);

        n1=r.nextInt();

        n2=r.nextInt();

        System.out.println("Select Opeation");

        ch=r.nextInt();

        if(ch==1)
        {
            cal=n1+n2;
            System.out.println("Addition=> "+ cal);
        }

        else if(ch==2)
        {
            cal=n1-n2;
            System.out.println("Subtraction=> "+ cal);
        }
        else if(ch==3)
        {
            cal=n1*n2;
            System.out.println("Multiplication=> "+ cal);
        }
        else
        {
            cal=n1%n2;
            System.out.println("Modulo=> "+ cal);
        }

    }
    
}
