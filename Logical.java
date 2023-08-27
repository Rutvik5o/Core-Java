import java.util.Scanner;

class Logical
{
    public static void main(String []args)
    {
      int a,b,c,d;
      System.out.println("Enter Four Number-> ");

      Scanner Obj=new Scanner(System.in);

      a=Obj.nextInt();

      b=Obj.nextInt();

      c=Obj.nextInt();

      d=Obj.nextInt();

      System.out.println((a>b) && (c<d));

      System.out.println((a>b) || (c<d));

      System.out.println(!(a<b));
    }
}