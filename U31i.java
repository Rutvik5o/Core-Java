import p.U31;

public class U31i //DemoClass
{
    public static void main(String []args)
    {
        U31 Obj=new U31();
        int ans=Obj.findmax(99,55,26);
        System.out.println("Maximum Number=> "+ans);
    }
}

//javac -d . U31.java
//javac U31i.java
//java U31i