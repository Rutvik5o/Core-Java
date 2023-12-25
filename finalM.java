class test
{
     void mNumber()
     {
        System.out.println("8439993");
     }

     final void atmPIN()
     {
        System.out.println("8111");
     }
}


class theif extends test
{
    @Override
    void mNumber()
    {
        System.out.println("83434433");
    }

   /*  @Override
    void atmPIN()
    {
        System.out.println("8111");
    } */ //can't override due to that method is final in Parent class
}

class finalM{

    public static void main(String []args)
    {
        theif t=new theif();
        t.mNumber(); t.atmPIN();
    }
}