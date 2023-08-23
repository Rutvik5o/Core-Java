class test
{
     int a=10; // Instance Variable
     static int b=20; // static variable

     public static void main(String[] args)
     {
         int c=30; // local variable
         final int D=40; // final variable-> Can be Capital

         test t=new test();

         System.out.println(t.a);  // only access through object

         System.out.println(b);   // call direct [no need object]

         System.out.println(c);  

         System.out.println(D);   // final variable can be capital

     }
}