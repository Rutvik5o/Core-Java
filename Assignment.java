import java.util.Scanner;

class Assignment
{
     public static void main(String []args)
     {
        int a,b;

        System.out.println("Enter Two Number-> ");

        Scanner Obj=new Scanner(System.in);

        a=Obj.nextInt();

        b=Obj.nextInt();

        //a=10; = is assignement

        a+=b;
        System.out.println(a);

        
        a-=b;
        System.out.println(a);


     }
}