import java.util.Scanner;

public class MulTable {
    
    public static void main(String []args)
    {
        int num;

        System.out.println("Enter those Number Which you want to get Multipliation Number-> ");

        Scanner Obj=new Scanner(System.in);

        num=Obj.nextInt();

        System.out.println("Enter How Many Number till you want a Multiplication Table");

        int n=Obj.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.println(num+ " * "+ i + " ="+num*i );
        }
    }
}
