/*(1)=>write an application that starts two thread. First thread display even numbers
in the range specified from the command line and second thread displays odd numbers
in the range. Each thread waits for 300 milliseconds before displaying the next
numbers. The application waits for both the thread to finish and then displays
the message "Both Threads Completed".
*/


class eventhread extends Thread
{
  int a,b;
  
  eventhread(int x,int y)
  {
    a=x;
    b=y;
  }
  
  public void run()
  {
    try
    {
        for(int i=a;i<=b;i++)
        {
            if(i%2==0)
            {
                Thread.sleep(300);
                
                System.out.println("Even Thread=> "+i);
            }
        }
        
  }catch(Exception e)
  { 
     e.printStackTrace();
  }
  
}
}

class oddthread extends Thread
{
    int a,b;
    
    oddthread(int x,int y)
    {
        a=x;
        b=y;
    }
    
    public void run()
    {
    
        for(int i=a;i<=b;i++)
        {
            if(i%2!=0)
            {
                
                
                System.out.println("Odd Thread=> "+i);
            }
        }
        
  }
}
  


class U41
{
    public static void main(String []args)
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        
        eventhread e1=new eventhread(a,b);
        oddthread o1=new oddthread(a,b);
        
        e1.start();
        o1.start();
        
        try
        {
            e1.join();
            o1.join();
        }
        catch(InterruptedException e) {}
        
        System.out.println("Both Threads Completed");
    }
}

    