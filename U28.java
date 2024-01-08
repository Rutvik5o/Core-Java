//(8)=>Write an interface called Exam with a method Pass(int mark) that returns aBoolean. Write another interface called Classify with a method Division(int
//average) which returns a string. Write a class called Result which implementsboth Exam and Classify. The pass method should return true if the marks is
//greater than or equal to 35 else false. The division method must return “First”when the parameter average is 60 or more, “second” when average is 50 or
//more but below 60, “no division” when average is less than 50. 
interface exam
{
    boolean pass(int marks);
}

interface classify
{
       String division(int avg);
}

class result implements exam,classify
{
    public boolean pass(int marks)
    {
      return marks>=35; /* if(marks>=35)   
                            return(true);
                            else
                            return(false); */
    }

    public String division(int avg)
    {
        if (avg >= 60)
            return "First";

        else if (avg< 60 && avg >= 50)
            return "Second";

        else
            return "No Division";
    }
}


class U28
{
    public static void main(String []args)
    {
        result Obj=new result();

        System.out.println("\nYour Result=> "+Obj.pass(65));

        System.out.println("\nYour Divison=> "+Obj.division(75));
    }
}
