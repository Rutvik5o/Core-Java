// static variable
class Static1
{
      static int b=20; //static
      int c=30; // instance

      public static void main(String []args)
      {
          int a=10;//local

          Static1 ref=new Static1();
          System.out.println(a);
          System.out.println(Static1.b);
          System.out.println(ref.c);
      }
}