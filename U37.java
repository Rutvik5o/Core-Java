//(7)=>Write an applicateion that accpects marks of three different subject from user.
//Marks should be between 0 to 100, if marks of any of the subject is not belong
//to this range, generate custom exception out of RangeException. If marks of each 
//subjects are greater than or equal or 40 then display message "PASS" along
//with percentange, otherwise display message "FAIL". Also write exception handling
//code to catch all the possible runtime exceptions likely to be generated 
//int the program.


class RangeException extends Exception
{
    RangeException(int i)
    {
        super("Range Exception : Marks is not valid"+ i);
    }
}

class U37
{
    public static void main(String []args)
    {
        int a[]=new int[3];

        int sum=0;

        float percentange;

        for(int i=0;i<3;i++)
        {
            try
            {
                a[i]=Integer.parseInt(args[i]);
                
                if(a[i]<0 || a[i]>100)
                {
                    throw new RangeException(a[i]);
                }
                else if(a[i]>=40)
                {
                    sum+=a[i];
                    System.out.println("Pass In Subject=> "+i);
                }
                else
                {
                    System.out.println("Fail In Subject=> "+i);
                }
            }
            catch(RangeException e1)
            {
                System.out.println("Error=> "+e1.getMessage());
            }
            
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array Index Exception Occurs");
            }

            catch(NumberFormatException e)
            {
                System.out.println("Number Format Exception");
            }
        }

        percentange=(float)sum/3;

        System.out.println("Percentange=> "+percentange);
    }
}
