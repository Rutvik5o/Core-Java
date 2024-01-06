//(6)=>Create a class called NumberData the accept of the five Numbers.Create a sub class called Numplay which provides methods for following:
//1.Display Numbers Entered
//2.Sum of Number.
//3.Average of the Numbers.
//4.Maximum of the Numbers.
//5.Minimum of the Numbers.

//Create a class that provides menu for above methods. Give Methods from the command-line argument.

import java.util.*;


class Numberdata 
{
    int a[]=new int[5];

    Scanner Obj=new Scanner(System.in);

    void createarray()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("\nEnter Element-> ");
            a[i]=Obj.nextInt();
        }
    }
}

class Numplay extends Numberdata
{
    void display()
    {
        createarray();
        for(int i=0;i<5;i++)
        {
            System.out.println("\nElements=> "+a[i]);
        }
    }

    void sum()
    {
        int s=0;

        createarray();

        for(int i=0;i<5;i++)
        {
            s+=a[i];
        }

        System.out.println("\nSum is=> "+s);
    }

    void avg()
    {
        int sum=0;
        createarray();

        for(int i=0;i<5;i++)
        {
            sum+=a[i];
        }
        float a=(float) sum/5;
        System.out.println("Average is=> "+a);
    }

    void max()
    {
        int m=0;

        createarray();

        for(int i=0;i<5;i++)
        {
            if(m<a[i])
                m=a[i];
        }

        System.out.println("\nMaximum is=> "+m);
    }

    void min()
    {
        createarray();

        int m=a[0];

        for(int i=0;i<5;i++)
        {
            if(m>a[i])
                 m=a[i];
        }

        System.out.println("\nMinimum is=> "+m);
    }
}

class U26
{
    public static void main(String []args)
    {
        Numplay Obj=new Numplay();

        int ch=Integer.parseInt(args[0]); // Enter Choic Through Command line argument

        switch(ch)
        {
            case 1: Obj.display();
                    break;

            case 2: Obj.sum();
                    break;

            case 3: Obj.avg();
                    break;

            case 4: Obj.max();
                    break;
            
            case 5: Obj.min();
                    break;

            default: System.out.println("Wrong Choice!!");
                    
        }
    }
}