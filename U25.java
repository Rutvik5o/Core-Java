//(5)=> Write an Interface called numbers, with a methods in Process(int x,int y). Write a class called sum,which in the method Process finds the //sum of two Numbers and return an int value.Write another class called Average,in which the Process methods finds the average of the two numbers and int.
import java.util.Scanner;

interface Numbers
{
    int Process(int x,int y);
}

class sum implements Numbers
{
    public int Process(int x,int y)
    {
        return (x+y);
    }
}

class average extends sum
{
    public int Process(int x,int y)
    {
         return ((x+y)/2);
    }
}

class U25
{
    public static void main(String []args)
    {
        int x,y;

        sum s1=new sum();

        average a1=new average();

        Scanner Obj=new Scanner(System.in);

        System.out.println("Enter a Number-> ");

        x=Obj.nextInt();

        System.out.println("Enter a Another Number-> ");

        y=Obj.nextInt();

        System.out.println("Sum=> "+s1.Process(x,y));

        System.out.println("Average=> "+a1.Process(x,y));
    }
}