//(10)=>Write a java program to display powers of 2 i.e. 2,4,8,16 etc up to 1024 using
//bitwise Operators.
class U10
{
    public static void main(String[] args)
    {
        int x=1;

        for(int i=0;i<=10;i++)
        {
            x=x<<1;

            System.out.println(x);
        }
    }
}