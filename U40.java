//(10)=>Write a program that accpects 5 even numbers from command line. If any of the
//numbers id odd then throw custom excetion OddExcepton and count such invalid numbers.

class OddNumberException extends Exception
{
    OddNumberException(int i)
    {
        super("Number is Odd=> "+i);
    }
}

class U40
{
    public static void main(String []args)
    {
        int a[]=new int[args.length];

        for(int i=0;i<args.length;i++)
        {
            try
            {
                a[i]=Integer.parseInt(args[i]);

                if(a[i]%2!=0)
                {
                    throw new OddNumberException(a[i]);
                }
            }
            catch(OddNumberException e)
            {
                System.out.println("Exception Occured"+e);

            }
        }
    }
}

