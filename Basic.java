// this program related java in method : if we declar method without static then we need to make object of that method after we can execute it for. if metho 
// is basic then use static for direct execute.

/* if member static then no need object can be done with class name */
class Basic
{
      void show()
      {
         System.out.println("Good Morning");
      }

      public static void main(String[] args)
      {
          Basic ref= new Basic();
          ref.show();

          System.out.println("Welcome to Java Programming Language");
      }
}