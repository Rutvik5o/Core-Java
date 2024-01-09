package xyz;

class ExPackage
{
        public void show()
        {
            System.out.println("Welcome");
        }
 

    public static void main(String []args)
    {
               ExPackage Obj=new ExPackage();
               Obj.show();
    }
}

//javac -d . ExPackage.java
//java xyz.ExPackage