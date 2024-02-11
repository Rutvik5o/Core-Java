//(3)=>write a java program to create 2 threads each thread calculates the sum
//ad average of 1 to 10 and 11 to 20 respectively. After all thread finish,
//main thread should print message. "Task Completed". Write this program with 
//use of runnable interface.


class thread1 implements Runnable
{
    int sum1=0,i;

    public void run()
    {
        for(i=1;i<=10;i++)
        {
        try
        {
            sum1+=i;
            System.out.println("Thread1 Sleeped");

            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {}
         }

    System.out.println("Thread1 sum=> "+sum1);

    System.out.println("Average of 1 to 10 number is=> "+(sum1/10));
}
}

class thread2 implements Runnable
{
    int sum2=0,i;

    public void run()
    {
        for(i=11;i<=20;i++)
        {
        try
        {
            sum2+=i;

            System.out.println("Thread2 Sleeped");

            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {}
         }

    System.out.println("Thread2 sum=> "+sum2);

    System.out.println("Average of 11 to 20 number is=> "+(sum2/10));
}
}

class U43
{
    public static void main(String []args)
    {
        thread1 th1=new thread1();
        thread2 th2=new thread2();

        Thread t1=new Thread(th1);
        Thread t2=new Thread(th2);

        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        }

        catch(InterruptedException e)
        {
            System.out.println(e);

        }

        int total=th1.sum1+th2.sum2;

        System.out.println("*********************************");

        System.out.println("The Final Total=> "+total);

        System.out.println("************************************");

        System.out.println("The Average=> "+total/2);

        System.out.println("****Task Completed**********");


    }
}
