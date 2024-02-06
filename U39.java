//(9)=>Write an application that converts between meters and feet. Its first command-
//line argument is a number and second command line argument is either 
//"Centimeter" or "Meter". It the argument equal "Centimeter" display a string
//reportng the equivalent number of meters. If this argument equals "meters",
//display a string reporting the equivalent number of centimeter. If unit is not
//given properly then generate custom Exception unitFormatException. If first 
//argument is not proper format then generate NumberFormatException.
//Generate other Exception as per requirement. (1 Meter = 100 Centimeter)


class UnitFormatException extends Exception
{
    UnitFormatException(String s)
    {
        super("Unit Format Exception: Unit is not valid"+s);
    }
}

class U39
{
    public static void main(String []args)
    {
        int no;
        String u;

        try
        {
            no=Integer.parseInt(args[0]);

            u=args[1];

            if((u.equals("Centimeter")) || (u.equals("Meter")))
            {
                if(u.equals("Centimeter"))
                {
                    int m=no/100;

                    System.out.println("Equivalent Number Of Meter is=> "+m);
                }
            
              else
              {
                int cm=no*100;

                System.out.println("Equivalent Number Of Centimeter is=> "+cm);
              }
            }
            else
            {
                throw new UnitFormatException(u);
            }

        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out Of Bounds Exception Occurs");
        }

        catch(NumberFormatException e)
        {
            System.out.println("Number Format Exception Occurs");
        }

        catch(UnitFormatException e1)
        {
            System.out.println("Error=> "+e1.getMessage());
        }

        }
    }
