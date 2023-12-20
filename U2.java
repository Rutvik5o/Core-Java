
class U2java
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