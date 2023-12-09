import java.util.Scanner;

public class AvgMarks {

    public static void main(String []args)
    {
        int a,b,c,d,e;

        System.out.println("Enter Any Five Subject Marks-> ");

        Scanner Obj=new Scanner(System.in);

        a=Obj.nextInt();

        b=Obj.nextInt();

        c=Obj.nextInt();

        d=Obj.nextInt();

        e=Obj.nextInt();

        int sum=a+b+c+d+e;

        System.out.println("Total Marks=> "+ sum);

        double avg=sum/5;

        System.out.println("Average Of Five Subject=> "+ avg);


    }
    
}
