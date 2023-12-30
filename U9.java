//(9)=>A bamk gives 6.5% per annum interest on depends made in that bank.Write a program to calculate the total amount that a person will receive after the end of 5 years for a deposit of Rs.5000 for compound interest. 
//Create necessary methods and constructors too.

class CalAmount
{
    double p,r,n;


    CalAmount(double p1, double r1,double n1)
    {
        p=p1;
        r=r1;
        n=n1;
    }

    void CallInt()
    {
        double ci=p*(Math.pow((1+(r/100)),n));

        double netvalue=p+ci;

        System.out.println("Interest is=> "+ci+ " & amount received is=> "+netvalue);
    }
}

class U9
{
    public static void main(String []args)
    {
        double p=5000, r= 6.5 ,n=5;

        CalAmount Obj=new CalAmount(p,r,n);

        Obj.CallInt();
    }
}