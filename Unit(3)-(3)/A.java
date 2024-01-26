//(3)=> Create packages pack1 within this package create class A which contains one
//instance variable and one instance metod. Create another package pack2
//within this package create class B. Where class B is calling the method and variable of class A.
package pack1;

public class A
{
    public int a=10;

    public void display()
    {
        System.out.println("Class A Of Package Pack1");
    }
}