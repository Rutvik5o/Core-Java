//(7)=>Delcare an abstract class Vehicle wiwth an abstract methods name numWheels(). Provide subclasses Car and Truck that
//each implements this methods. Create instance of these subclasses and demostrate the use of this method.

abstract class Vehicle
{
    abstract void numWheels();
}

class car extends Vehicle
{
    void numWheels()
    {
        System.out.println("Car Class with four wheels");
    }
}

class truck extends Vehicle
{
    void numWheels()
    {
        System.out.println("Truck class with six wheels");
    }
}

class U27
{
    public static void main(String []args)
    {
        car Obj1=new car();
        Obj1.numWheels();

        truck Obj2=new truck();
        Obj2.numWheels();


    }
}
