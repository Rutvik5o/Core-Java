//(2)=>Write a program that create and starts five threads. Each thread is instantiated from the same class.
//from the same class. It exectures a loop with ten iterations. Each interation display the character 'x' and
//sleep for 500 milliseconds. The application waits for all the threas to complete and then display a message "hello".
class thread1 extends Thread
{
    int i;

    public void run()
    {
        for(i=0;i<=10;i++)
        {
            try
            {
                System.out.println("T1----x"+i);
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {

            }


        }

       
    }
}

class thread2 extends Thread
{
    int i;

    public void run()
    {
        for(i=0;i<=10;i++)
        {
            try
            {
                System.out.println("T2----x"+i);
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {

            }


        }

       
    }
}

class thread3 extends Thread
{
    int i;

    public void run()
    {
        for(i=0;i<=10;i++)
        {
            try
            {
                System.out.println("T3----x"+i);
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {

            }


        }

       
    }
}

class thread4 extends Thread
{
    int i;

    public void run()
    {
        for(i=0;i<=10;i++)
        {
            try
            {
                System.out.println("T4----x"+i);
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {

            }


        }

       
    }
}

class U42 
{
    public static void main(String []args)
    {
        thread1 th1=new thread1();
        thread2 th2=new thread2();

        thread3 th3=new thread3();
        thread4 th4=new thread4();

        Thread t1=new Thread(th1);
        Thread t2=new Thread(th2);
        Thread t3=new Thread(th3);
        Thread t4=new Thread(th4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try
        {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println("*************************HELLO*************************");
     
    }
}
