//(4)=> Write a java program to scan 3 integer values from the command line arugment and display the maximum number using conditional operator.

class U4
{
    public static void main(String []args)
    {
        int a,b,c,max;

        a=Integer.parseInt(args[0]);

        b=Integer.parseInt(args[1]);

        c=Integer.parseInt(args[2]);

        max=(a>b)?((a>c)?a:c):((b>c)?b:c);

        System.out.println("Max=> "+max);
    }
}

//java U4 10 20 30 (Pass Three Argument)
