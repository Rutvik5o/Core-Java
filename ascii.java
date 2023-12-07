import java.util.Scanner;
class ascii{
    public static void main(String []args)
    {
        char ch;

        System.out.println("Enter Any Value-> ");

        Scanner Obj= new Scanner(System.in);

        ch=Obj.next().charAt(0);

        int a=ch;

        System.out.println("ASCII Value of -> " + ch + " is " + a);
    }
    
}
