import java.util.Scanner;

public class EligibilityVote {

    public static void main(String []args)
    {
        int age;

        System.out.println("Enter Your Age=> ");

        Scanner Obj=new Scanner(System.in);

        age=Obj.nextInt();

        if(age>=18)
        {
            System.out.println("You Are Eligible For Vote");
        }
        else
        {
            System.out.println("You are not Eligible For Vote");
        }
    }

    }
    

