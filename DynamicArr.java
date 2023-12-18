import java.util.Scanner;

class DynamicArr
{

    public static void main(String []args)
    {
    int size,i;

    System.out.println("Enter Size of Array-> ");

    Scanner Obj=new Scanner(System.in);

    size=Obj.nextInt();

    int a[]=new int[size];

    for(i=0;i<size;i++)
    {
        a[i]=Obj.nextInt();
    }

    System.out.println("Printing Array=> ");

    for(i=0;i<size;i++)
    {
        System.out.println(a[i]);
    }
}
}