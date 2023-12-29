//(2)=> A motor cycle dealer sells to two-wheelers to his customer on loan,which is to be repaid in 5 years. The dealer charges simple interest for the whole term on the 
//day of giving the loan itself. The total amount is then divided by 60(months) and is collected as equated monthly installment(EMI).Write a program to calculate
//the EMI for a loan of Rs. X, where X is given from command line argument. Print the EMI value in rupees.
class U2
{
    public static void main(String []args)
    {
        int loan=Integer.parseInt(args[0]);

        float rate=Float.parseFloat(args[1]);

        int time=5;

        float si=(loan*time*rate)/100;

        System.out.println("Simple Interest=> "+si);

        float total=si+loan;

        System.out.println("Total Loan=> "+total);
        float emi=total/12;

        System.out.println("EMI=> "+emi);
    }
}


//java U2.java 100 200
