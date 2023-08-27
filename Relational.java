import java.util.Scanner;

class Relational  // <,>,<=,>=,!-
{
     public static void main(String[] args)
     {
        int a,b;

        System.out.println("Enter Two Number-> ");

        Scanner Obj=new Scanner(System.in);

        a=Obj.nextInt();
        b=Obj.nextInt();

        System.out.println((a<b));
        System.out.println((a!=b));

     }
}