class Static2
{
     static int a=10;

     void fun()
     {
         int b=10;
         System.out.println(a+" "+b);
         ++a; ++b;
     }
     public static void main(String []args)
     {
        Static2 ref=new Static2();
        ref.fun();
        ref.fun();
     }

}
