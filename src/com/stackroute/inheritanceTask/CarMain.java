package com.stackroute.inheritanceTask;

class Vehicle {
    public void handSteering() {
        System.out.println("handStreering");
    }

    public void changingGear() {
        System.out.println("changing gear");
    }

    public void speed() {
        System.out.println("speed");
    }

}
class Car extends Vehicle
{
    //carEngine Overridden


   public void carEngine(String string)
   {
       string=string;
       System.out.println("CAR ENGINE TYPE"+string);
   }
   //carSpeedOverRidden


   public void carSpeed(int speed)
   {
       speed=speed;
       System.out.println("CAR SPEED"+speed);
   }
}
class HondaCity extends Car
{
 //carEngineOverridden


    public void carEngine(String string)
    {
        string=string;
        System.out.println("CAR ENGINE TYPE"+string);
    }
    //carSpeedOverridden


    public void carSpeed(int speed)
    {
        speed=speed;
        System.out.println("CAR SPEED"+speed);
    }
    public static void main(String args[])
    {

        //creating object for the hondacity and accessing all members

        HondaCity hondaCity = new HondaCity();
        Car car=new Car();
        {
            hondaCity.handSteering();
            hondaCity.changingGear();
            hondaCity.speed();
            hondaCity.carEngine("RX100");
            hondaCity.carSpeed(227);
            car.carEngine("PSLV");
            car.carSpeed(10000);


        }
    }
}


