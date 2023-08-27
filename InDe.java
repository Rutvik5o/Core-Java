import java.util.Scanner;

class InDe
{
    public static void main(String []args)
    {
        int a,b;

        System.out.println("Enter Two Number-> ");

        Scanner Obj=new Scanner(System.in);

        a=Obj.nextInt();

        b=Obj.nextInt();

        System.out.println("Entered Number=> ");

        System.out.println(a);

        System.out.println(b);

        System.out.println("Pre Post Increment:");

        System.out.println(a++);

        System.out.println(++a);

        System.out.println("Pre Post Decrement:");

        System.out.println(b--);

        System.out.println(--b);
    }
}