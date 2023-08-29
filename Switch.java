import java.util.Scanner;


class Switch
{
    public static void main(String []args)
    {
        int a,b,ch;

        System.out.println("Enter Your Choice");

        Scanner r=new Scanner(System.in);

        ch=r.nextInt();

        System.out.println("Enter Two Value-> ");

        a=r.nextInt();

        b=r.nextInt();

       

        switch(ch)
        {
              case 1: System.out.println("Sum=> "+(a+b));
                      break;

              case 2: System.out.println("Subtraction=> "+(a-b));
                      break;

              case 3: System.out.println("Multiplication=> "+(a*b));
                      break;

              case 4: System.out.println("Divison=> "+(a/b));
                      break;

              case 5: System.out.println("Modulo=> "+(a%b));
                      break;

              default: System.out.println("Invalid Choice");



        }
    }
}